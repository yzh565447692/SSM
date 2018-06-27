package com.hdu.controller;

import com.hdu.entity.User;
import com.hdu.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
@RequestMapping("/show")
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping("/showUserById")
    public String showUserById(Integer id,Model model){
        User user = userService.findUserById(id);
        model.addAttribute("user",user);
        return "result";
    }

}