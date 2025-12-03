package tn.esprit.com.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.com.enums.StatusCommande;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "commande")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCommande;
    private LocalDate dateCommande;
    private float totalCommande;
    @Enumerated(EnumType.STRING)
    private StatusCommande statusCommande;

    @ManyToOne
    private Client client;

    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    private List<Detail_Commande> detailCommands = new ArrayList<>();
}
