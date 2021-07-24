package com.fuvidy.spring_cloud_demo_ribbon_producer.service.impl;

import com.fuvidy.spring_cloud_demo_common.modle.User;
import com.fuvidy.spring_cloud_demo_ribbon_producer.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    static ArrayList<User> users = new ArrayList<>();
    static {
        User user1 = new User(1L,"fuvidy1",10);
        User user2 = new User(2L,"fuvidy2",12);
        User user3 = new User(3L,"fuvidy3",13);
        User user4 = new User(4L,"fuvidy4",14);
        User user5 = new User(5L,"fuvidy5",15);
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);
    }

    @Override
    public void create(User user) {
        users.add(user);
    }

    @Override
    public User getUser(Long id) {
        List<User> users = this.users.stream().filter(user -> user.getId().equals(id)).collect(Collectors.toList());
        return users.get(0);
    }

    @Override
    public List<User> getUserByIds(List<Long> ids) {
        List<User> users = new ArrayList<>();
        for (Long id : ids) {
            for (User user : this.users) {
                if (user.getId().equals(id)) {
                    users.add(user);
                }
            }
        }
        return users;
    }

    @Override
    public void update(User user) {
        for (User user1 : this.users) {
            if (user1.getId().equals(user.getId())) {
                user1.setAge(user.getAge());
                user1.setUsername(user.getUsername());
                break;
            }
        }
    }

    @Override
    public User delete(Long id) {
        for (User user : this.users) {
            if (user.getId().equals(id)) {
                users.remove(user);
                return user;
            }
        }
        return null;
    }
}
