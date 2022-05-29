package ru.mirea.senebank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.senebank.entity.AccountEntity;

@Repository
public interface AccountRepository extends CrudRepository<AccountEntity, Long> {
    AccountEntity getByAccountNumber(Long accountNumber);
}
