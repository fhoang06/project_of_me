package com.example.projectofme.controller;

import com.example.projectofme.entity.User;
import com.example.projectofme.service.IUser;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/home")
@RequiredArgsConstructor
public class HomeController {

    private IUser iUser;
    private static final Logger logInfo = LoggerFactory.getLogger(AdminController.class);

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return iUser.addUser(user);
    }

    @PutMapping("/update")
    public User updateUser(@RequestParam("id") long id, @RequestBody User user){
        return iUser.updateUser(id,user);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable("id") long id){
        return iUser.deleteUser(id);
    }

    @GetMapping("/list")
    public List<User> getAllUser(){
        logInfo.info("thong tin dang nhap bang tai khoan admin");
        logInfo.debug("thong tin dang nhap bang tai khoan user");
        return iUser.getAllUser();
    }
}
