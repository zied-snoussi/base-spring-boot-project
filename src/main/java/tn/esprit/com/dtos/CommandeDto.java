package tn.esprit.com.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.com.enums.StatusCommande;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class CommandeDto {
    private Long idCommande;
    private LocalDate dateCommande;
    private float totalCommande;
    private StatusCommande statusCommande;
    private Long clientId;
    private List<Long> detailCommandeIds;
    private List<DetailCommandeDto> details;
}
