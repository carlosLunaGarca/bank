package com.prueba.bank.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prueba.bank.Entitys.debt;

import java.util.List;

@Repository
public interface debtrepository extends JpaRepository<debt,Integer> {
    List<debt> findAllByIdClient(Integer idclient);
}
