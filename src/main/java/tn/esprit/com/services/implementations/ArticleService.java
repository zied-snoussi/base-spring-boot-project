package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Article;
import tn.esprit.com.repositories.ArticleRepository;
import tn.esprit.com.services.interfaces.IArticleService;

import java.util.List;

@Service
@AllArgsConstructor
public class ArticleService implements IArticleService {

    ArticleRepository articleRepository;

    @Override
    public Article add(Article entity) {
        return articleRepository.save(entity);
    }

    @Override
    public List<Article> saveAll(List<Article> entities) {
        return articleRepository.saveAll(entities);
    }

    @Override
    public Article findById(Long aLong) {
        return articleRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<Article> findAll() {
        return articleRepository.findAll();
    }

    @Override
    public Article update(Article entity) {
        return articleRepository.save(entity);
    }

    @Override
    public void delete(Article entity) {
        articleRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        articleRepository.deleteAll();
    }

    @Override
    public void deleteById(Long aLong) {
        articleRepository.deleteById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return articleRepository.existsById(aLong);
    }
}
