package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
}
