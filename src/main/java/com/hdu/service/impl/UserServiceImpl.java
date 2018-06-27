package com.hdu.service.impl;

import com.hdu.entity.User;
import com.hdu.dao.UserMapper;
import com.hdu.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public User findUserById(Integer id) {
        User user = userMapper.findUserById(id);
        return user;
    }
}
