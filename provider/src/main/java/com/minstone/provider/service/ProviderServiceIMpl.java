package com.minstone.provider.service;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProviderServiceIMpl implements ProviderService {

    @Override
    public String hi(String content) {
        return "hi,ni hao a! "+content;
    }
}
