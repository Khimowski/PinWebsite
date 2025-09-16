package com.zredtea.controller;

import com.zredtea.dto.LoginForm;
import com.zredtea.entity.User;
import com.zredtea.service.LoginService;
import com.zredtea.utils.PWDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @RequestMapping(value="/login",method= RequestMethod.GET)
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView("login");
        mav.addObject("LoginForm", new LoginForm());
        return mav;
    }

    @RequestMapping(value="/loginProcess",method=RequestMethod.POST)
    public ModelAndView loginProcess(@ModelAttribute("LoginForm") LoginForm loginForm){
        ModelAndView mav = null;
        String username = loginForm.getUsername();
        String password = loginForm.getPassword();

        User userToLogin = loginService.getUserByUsername(username);
        if(userToLogin == null) {
            mav = new ModelAndView("login");
            mav.addObject("message","用户名错误");
        } else {
            password = PWDUtil.PasswordGetSHA256(password, userToLogin.getSalt());
            if (userToLogin.getPassword().equals(password)) {
                mav = new ModelAndView("welcome");
                mav.addObject("username", username);
            } else {
                mav = new ModelAndView("login");
                mav.addObject("message", "密码错误");
            }
        }
        return mav;
    }
}
