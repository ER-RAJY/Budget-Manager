package com.panchalprogrammingacademy;

import com.panchalprogrammingacademy.dao.UserDao;
import com.panchalprogrammingacademy.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/hello_world", method = RequestMethod.GET)
    public String printHelloWorld(ModelMap modelMap){
        User user = new User();
        user.setName("John Doe");
        userDao.save(user);

        modelMap.addAttribute("message", "Hello World and Welcome to Spring MVC!");
        modelMap.addAttribute("users", userDao.list());
        return "hello_world";
    }
}
