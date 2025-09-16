package com.zredtea.controller;

import com.zredtea.dao.UserDao;
import com.zredtea.service.LoginService;
import com.zredtea.service.impl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloController {
    @Autowired
    private LoginServiceImpl loginService;

    @RequestMapping("/some.do")
    public ModelAndView doSome() {
        ModelAndView mv =  new ModelAndView();
        mv.addObject("msg", "Hello World");
        mv.addObject("fun", "执行了dosome");

        mv.setViewName("show");
        return mv;
    }
}