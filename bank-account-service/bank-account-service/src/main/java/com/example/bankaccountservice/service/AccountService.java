package com.example.bankaccountservice.service;

import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;
import com.example.bankaccountservice.enums.AccountType;

public interface AccountService  {
    BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
}
