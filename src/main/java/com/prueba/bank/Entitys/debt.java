package com.prueba.bank.Entitys;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class debt {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @NotNull
    private Integer idClient;
    private Long value;
    private Boolean activa;
    private Integer idBank;
    private Integer cuotas;
    private String nameBank;
}
