package com.prueba.bank.Entitys;

import com.sun.istack.NotNull;
import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private String email;
    @NotNull
    private String pass;
    private Boolean login;
}
