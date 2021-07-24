package com.fuvidy.spring_cloud_demo_ribbon_producer.controller;


import com.fuvidy.spring_cloud_demo_common.modle.User;
import com.fuvidy.spring_cloud_demo_ribbon_producer.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    private Logger LOGGER =  LoggerFactory.getLogger(this.getClass());

    @PostMapping("/create")
    public ResponseEntity<User> create(@RequestBody User user){
        userService.create(user);
        return new ResponseEntity<User>(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User user = userService.getUser(id);
        LOGGER.info("根据id获取用户信息，用户名称为：{}",user.getUsername());
        return ResponseEntity.ok(user);
    }
    @GetMapping("/getUserByIds")
    public ResponseEntity<List<User>> getUsers(@RequestParam List<Long> ids){
        List<User> list = userService.getUserByIds(ids);
        LOGGER.info("根据用户ID查询用户信息{}",list.toString());
        return ResponseEntity.ok(list);
    }
    @PostMapping("/update")
    public ResponseEntity<User> update(@RequestBody User user){
        userService.update(user);
        LOGGER.info("修改用户信息{}",user.toString());
        return ResponseEntity.ok(user);
    }
    @PostMapping("/delete/{id}")
    public ResponseEntity<User> delete(@PathVariable Long id){
        User user = userService.delete(id);
        LOGGER.info("修改用户信息{}",user.toString());
        return ResponseEntity.ok(user);
    }


}
