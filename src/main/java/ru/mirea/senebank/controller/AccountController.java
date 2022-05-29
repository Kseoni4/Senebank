package ru.mirea.senebank.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.mirea.senebank.model.TransactionModel;
import ru.mirea.senebank.service.AccountService;

@Controller
@AllArgsConstructor
public class AccountController {

    AccountService accountService;

    @GetMapping("/account/{account_number}")
    public ResponseEntity getAccountBalance(@PathVariable Long account_number){

        Long balance;

        if((balance = accountService.getBalance(account_number)) > 0){
            return ResponseEntity.ok(balance);
        } else {
            return ResponseEntity.ok("Такой счёт не найден");
        }
    }

    @PostMapping("/putMoney")
    public ResponseEntity addMoneyIntoAccount(@RequestBody TransactionModel transactionModel){
        accountService.putMoneyIntoAccount(transactionModel.getTo(), transactionModel.getAmount());
        return ResponseEntity.ok("Деньги положены на счёт "+transactionModel.getTo());
    }

}
