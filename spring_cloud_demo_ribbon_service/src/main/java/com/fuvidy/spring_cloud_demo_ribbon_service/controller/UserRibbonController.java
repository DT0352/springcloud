package com.fuvidy.spring_cloud_demo_ribbon_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserRibbonController {
    @Autowired
    private RestTemplate restTemplatel;
    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return restTemplatel.getForObject(userServiceUrl + "/user/{1}",ResponseEntity.class,id);
    }

}
