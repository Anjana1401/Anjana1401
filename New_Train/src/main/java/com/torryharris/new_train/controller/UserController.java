package com.torryharris.new_train.controller;

import com.torryharris.new_train.model.UserModel;
import com.torryharris.new_train.repository.UserRepository;
import com.torryharris.new_train.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Objects;

@Controller
public class UserController {
    @Autowired
    UserRepository repo;
    @Autowired
    UserService serv;
    @RequestMapping("login")
    public String register(){
      return "login.jsp";
    }
    @RequestMapping("add")
    public String login(UserModel user){
        repo.save(user);
        return "login.jsp";
    }
    @RequestMapping("get")
    public ModelAndView get(@RequestParam String userName){
        ModelAndView mv=new ModelAndView("index.jsp");
        UserModel usermodel=repo.findById(userName).orElse(new UserModel());
        mv.addObject(usermodel);
        return mv;
    }
//    @RequestMapping("login")
//    public String newlogin(){
//       return "login.jsp";
//    }
//    @GetMapping("login")
//    public ModelAndView login(){
//        ModelAndView mv=new ModelAndView("login.jsp");
//        mv.addObject("userModel",new UserModel());
//        return mv;
//    }
    @PostMapping("login")
    public String mav(@ModelAttribute("userModel") UserModel user1){
        UserModel user2=serv.service(user1.getUserName(), user1.getPassword());
        System.out.println(user2);
        if(Objects.nonNull(user2)){
            return "index.jsp";
        }
        else{
            return "login.jsp";
        }
    }

}
