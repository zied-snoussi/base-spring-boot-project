package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {
}
