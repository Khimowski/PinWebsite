package com.zredtea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
    @RequestMapping("/some.do")
    public ModelAndView doSome() {
        ModelAndView mv =  new ModelAndView();
        mv.addObject("msg", "Hello World");
        mv.addObject("fun", "执行了dosome");

        mv.setViewName("show");
        return mv;
    }
}