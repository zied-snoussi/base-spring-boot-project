package tn.esprit.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.com.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}
