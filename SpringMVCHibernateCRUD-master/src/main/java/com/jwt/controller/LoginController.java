package com.jwt.controller;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.dao.UserDaoImpl;
import com.jwt.model.*;
import com.jwt.service.UserService;
 
@Controller
public class LoginController {
  @Autowired
  UserService userService;
  @RequestMapping(value = "/", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("login");
    mav.addObject("login", new Login());
    return mav;
  }
  @RequestMapping(value = "/loginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("login") Login login) {
    ModelAndView mav = null;
    System.out.println("uname: "+login.getId()+" "+login.getPassword());
    User user = userService.getUser(login.getId());


    if (null != user && user.getPassword().equals(login.getPassword())) {
        System.out.println(userService.getUser(login.getId()).getPassword()+" "+userService.getUser(login.getId()).getPassword());
    mav = new ModelAndView("index");
   // mav.addObject("firstname", user.getFirstname());
    } else {
    mav = new ModelAndView("login");
    mav.addObject("message", "Username or Password is wrong!!");
    }
    return mav;
  }
}