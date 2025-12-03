package tn.esprit.com.services.implementations;

import tn.esprit.com.entities.Article;
import tn.esprit.com.services.interfaces.IArticleService;

import java.util.List;

public class ArticleService implements IArticleService {
    @Override
    public Article add(Article entity) {
        return null;
    }

    @Override
    public List<Article> saveAll(List<Article> entities) {
        return List.of();
    }

    @Override
    public Article findById(Long aLong) {
        return null;
    }

    @Override
    public List<Article> findAll() {
        return List.of();
    }

    @Override
    public Article update(Article entity) {
        return null;
    }

    @Override
    public void delete(Article entity) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }
}
