package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
