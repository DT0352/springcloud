package com.fuvidy.spring_cloud_demo_ribbon_producer.service.impl;

import com.fuvidy.spring_cloud_demo_common.modle.User;
import com.fuvidy.spring_cloud_demo_ribbon_producer.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    ArrayList<User> users = new ArrayList<>();

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
