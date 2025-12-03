package tn.esprit.com.entities;

import jakarta.persistence.*;
import lombok.*;
import tn.esprit.com.enums.TypeArticle;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "article")
@Getter
@Setter
@ToString(exclude = {"detailCommandes", "promotions"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idArticle;
    private String nomArticle;
    private float prixArticle;
    @Enumerated(EnumType.STRING)
    private TypeArticle typeArticle;

    @OneToMany(mappedBy = "article")
    private List<Detail_Commande> detailCommandes = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "article_promotion",
            joinColumns = @JoinColumn(name = "article_id"),
            inverseJoinColumns = @JoinColumn(name = "promotion_id")
    )
    private List<Promotion> promotions = new ArrayList<>();
}
