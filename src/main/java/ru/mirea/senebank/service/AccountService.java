package ru.mirea.senebank.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.senebank.entity.AccountEntity;
import ru.mirea.senebank.repository.AccountRepository;

@Service
@AllArgsConstructor
public class AccountService {

    AccountRepository accountRepository;

    public Long getBalance(Long accountNumber){
        if(accountRepository.getByAccountNumber(accountNumber) != null) {
            return accountRepository.getByAccountNumber(accountNumber).getMoney();
        } else {
            return -1L;
        }
    }

    public void putMoneyIntoAccount(Long accountNumber, Long amount){
        AccountEntity account = accountRepository.getByAccountNumber(accountNumber);

        Long newBalance = account.getMoney() + amount;

        account.setMoney(newBalance);

        accountRepository.save(account);
    }

}
