package tn.esprit.com.services.implementations;

import tn.esprit.com.entities.Promotion;
import tn.esprit.com.services.interfaces.IPromotionService;

import java.util.List;

public class PromotionService implements IPromotionService {
    @Override
    public Promotion add(Promotion entity) {
        return null;
    }

    @Override
    public List<Promotion> saveAll(List<Promotion> entities) {
        return List.of();
    }

    @Override
    public Promotion findById(Long aLong) {
        return null;
    }

    @Override
    public List<Promotion> findAll() {
        return List.of();
    }

    @Override
    public Promotion update(Promotion entity) {
        return null;
    }

    @Override
    public void delete(Promotion entity) {

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
