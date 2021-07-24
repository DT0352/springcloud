package com.fuvidy.spring_cloud_demo_feign_service.service;

/**
 * @Description
 * @Author 付志东
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/7/24
 */
import com.fuvidy.spring_cloud_demo_common.modle.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@FeignClient(value = "user-service",fallback = UserFallbackService.class)

public interface UserService {
    @PostMapping("/user/create")
    ResponseEntity<User> create(@RequestBody User user);

    @GetMapping("/user/{id}")
    ResponseEntity<User> getUser(@PathVariable("id") Long id);

    @PostMapping("/user/update")
    ResponseEntity<User> update(@RequestBody User user);

    @PostMapping("/user/delete/{id}")
    ResponseEntity<User> delete(@PathVariable("id") Long id);
}
