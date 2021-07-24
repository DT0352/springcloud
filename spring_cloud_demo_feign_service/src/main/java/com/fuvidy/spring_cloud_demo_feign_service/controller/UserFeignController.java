package com.fuvidy.spring_cloud_demo_feign_service.controller;

import com.fuvidy.spring_cloud_demo_common.modle.User;
import com.fuvidy.spring_cloud_demo_feign_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @Description
 * @Author 付志东
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/7/24
 */
@RestController
@RequestMapping("/user")
public class UserFeignController {
    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        return userService.getUser(id);
    }


    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user) {
        return userService.create(user);
    }

    @PostMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user) {
        return userService.update(user);
    }

    @PostMapping("/delete/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id) {
        return userService.delete(id);
    }
}
