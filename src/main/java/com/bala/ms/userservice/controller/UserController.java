package com.bala.ms.userservice.controller;

import com.bala.ms.userservice.entity.User;
import com.bala.ms.userservice.repository.UserRepository;
import com.bala.ms.userservice.service.UserService;
import com.bala.ms.userservice.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/Users")
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("/add")
    public User saveUser(@RequestBody User user){
        log.info("Inside UserController Save User Method");
        return service.saveUser(user);

    }


    @GetMapping("/{id}")
    public ResponseTemplateVO getUserWithDept(@PathVariable("id") Long userId){
        return service.getUserWithDepartment(userId);
    }

}
