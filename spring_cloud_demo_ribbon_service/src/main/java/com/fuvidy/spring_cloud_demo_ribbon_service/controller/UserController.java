package com.fuvidy.spring_cloud_demo_ribbon_service.controller;

import com.fuvidy.spring_cloud_demo_common.modle.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.user-service}")
    private String userServiceUrl;

    @GetMapping("/{id}")
    public ResponseEntity getUser(@PathVariable Long id) {
        return restTemplate.getForObject(userServiceUrl + "/user/{1}", ResponseEntity.class, id);
    }

    @PostMapping("/create")
    public ResponseEntity create(@RequestBody User user) {
        System.out.println(user.toString());
        return restTemplate.postForObject(userServiceUrl + "/user/create", user, ResponseEntity.class);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity delect(@PathVariable Long id) {
        return restTemplate.postForObject(userServiceUrl +"/user/delect",null,ResponseEntity.class);
    }

}
