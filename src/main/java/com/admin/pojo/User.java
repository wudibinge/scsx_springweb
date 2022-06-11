package com.admin.pojo;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer id;
    private String userName;
    private String password;
}
