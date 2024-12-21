package com.example.onlineeducationplatform.controller;

import com.example.onlineeducationplatform.model.User;
import com.example.onlineeducationplatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    //@GetMapping("/user/{id}")
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    public ModelAndView getUserById(@PathVariable int id) {
        User user = userService.getUserById(id);
        ModelAndView mav = new ModelAndView("user");
        mav.addObject("user", user);
        return mav;
    }
   //@PostMapping("registerServlet")
   @RequestMapping(value = "registerServlet",method = RequestMethod.POST)
    public  void register(User user, HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("注册用户名:"+user.getUsername()+"注册密码："+user.getPassword()+"注册邮箱"+user.getEmail());
       userService.register(user);


       response.sendRedirect("/index.jsp");

    }

    // 实现其他请求处理方法...
}
