package tn.esprit.com.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.com.entities.Client;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class AdresseDto {
    Long idAdresse;
    String rue;
    String ville;
    String codePostal;
    Long clientId;
}
