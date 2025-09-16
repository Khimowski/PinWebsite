package com.zredtea.controller;

import com.zredtea.entity.User;
import com.zredtea.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RegisterController {
    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping(value="/register", method=RequestMethod.GET)
    public ModelAndView register(){
        ModelAndView mav = new ModelAndView("register");
        mav.addObject("user", new User());
        return mav;
    }

    @RequestMapping(value="/registerProcess", method=RequestMethod.POST)
    public ModelAndView registerProcess(@ModelAttribute("user") User user) {
        loginService.newUser(user);
        return new ModelAndView("welcome", "name", user.getUsername());
    }
}