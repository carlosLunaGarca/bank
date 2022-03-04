package com.prueba.bank.Services.Impl;

import com.prueba.bank.Models.*;
import com.prueba.bank.Services.BankServices;

import java.util.ArrayList;
import java.util.List;
import com.prueba.bank.Entitys.bank;
import com.prueba.bank.Entitys.debt;
import com.prueba.bank.Entitys.user;
import org.springframework.beans.factory.annotation.Autowired;
import com.prueba.bank.Repositorys.*;
import org.springframework.stereotype.Service;

@Service
public class IBankService implements BankServices {
    @Autowired
    debtrepository debtrepository;
    @Autowired
    userRepository userRepository;
    @Autowired
    bankRepository bankRepository;


    @Override
    public List<Bank> GetBanks(Integer idClient) {
        ArrayList<Bank> Response= new ArrayList<>();
        if(userRepository.findById(idClient).get().getLogin()){
        List<debt> lista = debtrepository.findAllByIdClient(idClient);
            for (debt aux:lista) {
                Bank x= new Bank();
                x.setNameBank(aux.getNameBank());
                Response.add(x);
            }
            return Response;
        }else {
            return null;
        }
    }

    @Override
    public List<ResponseDebtforBank> getDebts(RequestListDebts debts) {
      ArrayList<ResponseDebtforBank> Response= new ArrayList<>();
      
      if (userRepository.findById(debts.getIdClient()).get().getLogin()){
          for (debt debt:debtrepository.findAllByIdClient(debts.getIdClient())) {
              ResponseDebtforBank aux= new ResponseDebtforBank();
              aux.setNameBank(debt.getNameBank());
              aux.setDues(debt.getCuotas());
              aux.setStatus(debt.getActiva());
              aux.setId(debt.getId());
              aux.setValue(debt.getValue().intValue());
              Response.add(aux);
          }
          return Response;
      }else{
          return Response;
      }
      

    }

    @Override
    public Responselogin login(login credentals) {
        Responselogin Response= new Responselogin();
        user user= userRepository.findByEmailAndAndPass(credentals.getEmail(),credentals.getPassword());
        if (user!=null){
           user.setLogin(true);
           userRepository.save(user);
           Response.setStatus(user.getLogin());
           Response.setIdClient(user.getId());
            return Response;
        }
        return Response;
    }

    @Override
    public Boolean logout(Integer idClient) {
     user user= userRepository.getById(idClient);
     user.setLogin(false);
     userRepository.save(user);
        return true;
    }

    @Override
    public Boolean payment(ResponseDebtforBank request) {

        debt debt = debtrepository.getById(request.getId());
        user user= userRepository.getById(debt.getIdClient());
        if (user.getLogin()){
            debt.setValue((long)request.getValue());
            debt.setCuotas(request.getDues());
            debt.setActiva(request.getStatus());
            debtrepository.save(debt);
            return true;
        }


        return false;
    }
}
