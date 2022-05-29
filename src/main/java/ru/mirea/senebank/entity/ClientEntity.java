package ru.mirea.senebank.entity;

import lombok.*;
import org.hibernate.Hibernate;
import ru.mirea.senebank.model.Role;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
public class ClientEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientID;

    private String clientName;

    private int clientAge;

    private Role role;

    private String password;

    @OneToOne()
    @JoinColumn(name = "accountNumber")
    private AccountEntity accountEntity;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ClientEntity entity = (ClientEntity) o;
        return clientID != null && Objects.equals(clientID, entity.clientID);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
