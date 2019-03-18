package com.minstone.provider.test;

import com.minstone.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProviderController {

    @Autowired
    ProviderService providerService;

    @GetMapping("hii")
    public String hi(String content){
        return providerService.hi(content);
    }
}
