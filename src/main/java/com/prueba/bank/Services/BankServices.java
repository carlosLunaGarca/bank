package com.prueba.bank.Services;

import com.prueba.bank.Models.*;
import org.springframework.stereotype.Service;

import java.util.List;


public interface BankServices {

public List<Bank> GetBanks(Integer idClient);
public List<ResponseDebtforBank> getDebts(RequestListDebts debts);
public Responselogin login(login credentals);
public Boolean logout(Integer idClient);
public Boolean payment(ResponseDebtforBank request);
}
