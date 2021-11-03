package com.torryharris.new_train.controller;

import com.torryharris.new_train.model.UserModel;
import com.torryharris.new_train.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
    @Autowired
    UserRepository repo;
    @RequestMapping("Register")
    public String register(){
      return "Register.html";
    }
    @RequestMapping("login")
    public String login(UserModel user){
        repo.save(user);
        return "Register.html";

    }
}
