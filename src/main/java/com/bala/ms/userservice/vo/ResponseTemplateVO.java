package com.bala.ms.userservice.vo;

import com.bala.ms.userservice.entity.Department;
import com.bala.ms.userservice.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}
