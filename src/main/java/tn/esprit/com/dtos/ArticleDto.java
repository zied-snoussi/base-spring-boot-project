package tn.esprit.com.dtos;

import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.com.entities.Client;
import tn.esprit.com.enums.TypeArticle;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ArticleDto {
    Long idArticle;
    String nomArticle;
    float prixArticle;
    TypeArticle typeArticle;
    java.util.List<PromotionDto> promotions;
}
