package com.prueba.bank.Controllers;

import com.prueba.bank.Models.*;
import com.prueba.bank.Services.BankServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PATCH})
@RequestMapping("/api/bank")
public class ControllersBank {
    @Autowired
    BankServices bankServices;

    @PostMapping("/login")
    public Responselogin login(@RequestBody login login){
        System.out.println("entro");
        return bankServices.login(login);
    }
    @GetMapping("/logout")
    public Boolean logout(@RequestParam(value ="id") Integer id){
        return bankServices.logout(id);
    }
        @PatchMapping("/payment")
        public Boolean payment(@RequestBody ResponseDebtforBank request){
        return bankServices.payment(request);
    }
    @GetMapping("/listbank")
    public List<Bank> GetBank(@RequestParam(value = "idclient") Integer id){
        return bankServices.GetBanks(id);
    }
    @PostMapping("/listdebts")
    public List<ResponseDebtforBank> getDebts(@RequestBody RequestListDebts request){
        return bankServices.getDebts(request);
    }

}
