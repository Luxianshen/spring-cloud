package com.minstone.provider.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public interface ProviderService {
    @GetMapping("hi")
    public String hi(@RequestParam("content") String content);
}
