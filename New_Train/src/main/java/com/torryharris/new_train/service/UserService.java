package com.torryharris.new_train.service;

import com.torryharris.new_train.model.UserModel;
import com.torryharris.new_train.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository repo;
    public UserModel service(String userName,String password){
        UserModel usermodel=repo.findByUserNameAndPassword(userName,password);
        return usermodel;
    }
}
