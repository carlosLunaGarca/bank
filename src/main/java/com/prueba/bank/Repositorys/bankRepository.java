package com.prueba.bank.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prueba.bank.Entitys.bank;
@Repository
public interface bankRepository extends JpaRepository<bank,Integer> {

}
