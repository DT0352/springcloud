package com.fuvidy.spring_cloud_demo_feign_service.service;

import com.fuvidy.spring_cloud_demo_common.modle.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @Author 付志东
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/7/24
 */
@Component
public class UserFallbackService implements UserService{
    @Override
    public ResponseEntity<User> create(User user) {
        User user1 = new User(-1L,"xkxkxk",0);
        return ResponseEntity.ok(user1);
    }

    @Override
    public ResponseEntity<User> getUser(Long id) {
        User defaultUser = new User(-1L, "defaultUser", 0);
        return ResponseEntity.ok(defaultUser);
    }

    @Override
    public ResponseEntity<User> update(User user) {
        User defaultUser = new User(-1L, "defaultUser", 1);
        return ResponseEntity.ok(defaultUser);
    }

    @Override
    public ResponseEntity<User> delete(Long id) {
        User defaultUser = new User(-1L, "defaultUser", 1);
        return ResponseEntity.ok(defaultUser);
    }
}
