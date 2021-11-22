package com.consumrest.serverpublicrest.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.http.StreamingHttpOutputMessage.Body;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MSMController {
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/entries")
    @JsonIgnoreProperties(ignoreUnknown = true)
    public List<Object> getEntries() {
        System.out.println("You visited");
        String url = "https://quoters.apps.pcfone.io/api/random";
        Object[] ents = restTemplate.getForObject(url, Object[].class);
        return Arrays.asList(ents);
    }
    @GetMapping("/hello")
    public String hello() {
        return "Hello world.com";
    }
    
}
