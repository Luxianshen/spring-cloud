package com.minstone.client.controller;

import com.minstone.client.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @GetMapping("test")
    public String test(String content){
        return clientService.hi("client "+content);
    }
}
