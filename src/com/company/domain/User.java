package com.company.domain;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

@Setter
@Getter
public class User {
    private Integer uid;
    @NotBlank(message = "��������Ϊ��")
    private String username;
    @NotBlank(message = "���벻��Ϊ��")
    @Length(min = 8,max = 15,message = "����λ��������8��15λ")
    private String password;
    @Email(message = "�����ʽ����ȷ")
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}