package ru.javacourse.lesson4.user.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.javacourse.lesson4.user.model.User;
import ru.javacourse.lesson4.user.service.UserService;

import java.util.List;

@RestController
public class MainController {
    private final UserService userService;
    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/get_all_user",method = RequestMethod.GET)
    public List<User> getAllUser(){

        return userService.getAllUser();
    }
    @RequestMapping(value = "/get_user",method = RequestMethod.POST)
    @ResponseBody
    public List<User> getUser(@RequestBody JsonNode request){
        System.out.println(request.toString());

        return userService.getUser(request);
    }
}
