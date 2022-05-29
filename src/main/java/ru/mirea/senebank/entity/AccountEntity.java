package ru.mirea.senebank.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "accounts")
@Setter
@Getter
@ToString
public class AccountEntity {

    @Id
    private Long accountNumber;

    private Long money;

}
