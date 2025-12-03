package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Detail_Commande;

public interface DetailCommandeRepository extends JpaRepository<Detail_Commande, Long> {
}
