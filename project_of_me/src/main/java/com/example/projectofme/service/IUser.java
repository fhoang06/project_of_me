package com.example.projectofme.service;

import com.example.projectofme.entity.User;

import java.util.List;

public interface IUser {
    public User addUser(User user);
    public User updateUser(long id, User user);
    public boolean deleteUser(long id);
    public List<User> getAllUser();
}
