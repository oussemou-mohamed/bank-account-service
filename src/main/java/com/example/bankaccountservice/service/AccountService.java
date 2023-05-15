package com.example.bankaccountservice.service;

import com.example.bankaccountservice.dto.BankAccountRequestDTO;
import com.example.bankaccountservice.dto.BankAccountResponseDTO;

public interface AccountService {
     BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountRequestDTO) ;

     BankAccountResponseDTO updateAccount(String id, BankAccountRequestDTO bankAccountDTO);
}
