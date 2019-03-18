package com.minstone.client;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;

public class ApiFallbackFactory<T> implements feign.hystrix.FallbackFactory {
    @Override
    public Object create(Throwable throwable) {
        Type[] faces = this.getClass().getGenericInterfaces();
        ParameterizedType pt = (ParameterizedType)faces[0];

        Class<?> clazz = (Class<?>)pt.getActualTypeArguments()[0];

        return Proxy.newProxyInstance(clazz.getClassLoader(), new Class[]{clazz}, (proxy, method, args) -> {
            throw throwable;
        });
    }
}
