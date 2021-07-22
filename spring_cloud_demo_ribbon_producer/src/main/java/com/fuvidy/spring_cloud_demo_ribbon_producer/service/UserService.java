package com.fuvidy.spring_cloud_demo_ribbon_producer.service;

import com.fuvidy.spring_cloud_demo_common.modle.User;

import java.util.List;

public interface UserService {

    void create(User user);

    User getUser(Long id);

    List<User> getUserByIds(List<Long> ids);

    void update(User user);

    User delete(Long id);
}
