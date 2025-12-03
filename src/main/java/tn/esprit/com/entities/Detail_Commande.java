package tn.esprit.com.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "detail_commande")
@Getter
@Setter
@ToString(exclude = {"commande", "article"})
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Detail_Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailCommande;
    private int quantiteArticle;
    private float sousTotalDetailArticle;
    private float sousTotalDetailArticleApresPromo;

    @ManyToOne
    @JoinColumn(name = "commande_id_commande")
    private Commande commande;

    @ManyToOne()
    @JoinColumn(name = "article_id_article")
    private Article article;
}
