package com.example.userpackage.controller;



import com.example.userpackage.domain.User;
import com.example.userpackage.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
   @Autowired
   private UserMapper userMapper;

   @RequestMapping("/users")
    public List<User> user(){
      System.out.println("user2");
       return userMapper.findAll();
   }

}
