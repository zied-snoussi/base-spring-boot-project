package tn.esprit.com.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ClientDto {
    private Long idClient;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private Long adresseId;
    private Long carteFideliteId;
    private AdresseDto adresse;
    private CarteFideliteDto carteFidelite;
}
