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
public class CarteFideliteDto {
    private Long idCarteFidelite;
    private int pointsAccumules;
    private LocalDate dateCreation;
    private Long clientId;
}
