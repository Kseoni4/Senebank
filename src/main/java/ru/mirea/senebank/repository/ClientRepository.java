package ru.mirea.senebank.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.mirea.senebank.entity.ClientEntity;

@Repository
public interface ClientRepository extends CrudRepository<ClientEntity, Long> {
    ClientEntity getByClientID(Long clientID);
    ClientEntity getByClientName(String clientName);
    ClientEntity findByClientName(String clientName);
}
