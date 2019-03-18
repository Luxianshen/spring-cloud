package com.minstone.client;

import com.minstone.provider.service.ProviderService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "server") //, fallbackFactory = ClientService.Fallback.class
public interface ClientService extends ProviderService {
    //class Fallback extends ApiFallbackFactory<ClientService> {}
}