package ru.mirea.senebank.model;

import lombok.Data;

@Data
public class TransactionModel {

    private Long from;
    private Long to;
    private Long amount;

}
