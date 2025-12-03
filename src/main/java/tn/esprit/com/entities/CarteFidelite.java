package tn.esprit.com.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "carte_fidelite")
@Getter
@Setter
@ToString(exclude = "client")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CarteFidelite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdresse;
    private int pointsAccumules;
    private LocalDate dateCreation;

    @OneToOne(mappedBy = "carteFidelite")
    private Client client;
}
