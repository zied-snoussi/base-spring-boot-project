package tn.esprit.com.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "client")
@Getter
@Setter
@ToString(exclude = "commandes")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idClient;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    @OneToOne(cascade = CascadeType.ALL)
    private Adresse adresse;

    @OneToMany(mappedBy = "client")
    private List<Commande> commandes = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private CarteFidelite carteFidelite;
}
