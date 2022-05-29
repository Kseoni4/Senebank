package ru.mirea.senebank.service;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.mirea.senebank.entity.AccountEntity;
import ru.mirea.senebank.entity.ClientEntity;
import ru.mirea.senebank.model.ClientModel;
import ru.mirea.senebank.repository.AccountRepository;
import ru.mirea.senebank.repository.ClientRepository;

import java.util.concurrent.ThreadLocalRandom;

@Service
@Slf4j
@AllArgsConstructor
public class ClientService {

    ClientRepository clientRepository;

    AccountRepository accountRepository;

    public ClientEntity addNewClient(ClientModel clientModel){
        ClientEntity client = new ClientEntity();

        client.setClientName(clientModel.getName());

        client.setClientAge(clientModel.getAge());

        AccountEntity account = new AccountEntity();
        account.setAccountNumber(ThreadLocalRandom.current().nextLong(0, Long.MAX_VALUE));
        account.setMoney(0L);

        accountRepository.save(account);

        client.setAccountEntity(account);

        log.info(client.toString());

        return clientRepository.save(client);
    }

}
