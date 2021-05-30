package com.bala.ms.userservice.service;

import com.bala.ms.userservice.entity.Department;
import com.bala.ms.userservice.entity.User;
import com.bala.ms.userservice.repository.UserRepository;
import com.bala.ms.userservice.vo.ResponseTemplateVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {
    @Autowired
    private UserRepository repo;
    @Autowired
    private RestTemplate restTemplate;

    public User saveUser(User user){
        log.info("insode UserService, save user Method");
        return repo.save(user);
    }

    public  User findUserById(Long id){
        log.info("insode UserService, findUserById Method");
     return repo.findByUserId(id);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {

        ResponseTemplateVO vo=new ResponseTemplateVO();
        User user=repo.findByUserId(userId);
        Department department=restTemplate.getForObject("http://localhost:9001/departments/"+user.getUserId(),Department.class);

       vo.setDepartment(department);
       vo.setUser(user);
        return vo;

    }
}
