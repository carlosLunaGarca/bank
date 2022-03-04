package com.prueba.bank.Repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prueba.bank.Entitys.user;
@Repository
public interface userRepository extends JpaRepository<user,Integer> {
    user findByEmailAndAndPass(String Email,String pass);
}
