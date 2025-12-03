package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Promotion;
import tn.esprit.com.repositories.PromotionRepository;
import tn.esprit.com.services.interfaces.IPromotionService;

import java.util.List;

@Service
@AllArgsConstructor
public class PromotionService implements IPromotionService {

    PromotionRepository promotionRepository;

    @Override
    public Promotion add(Promotion entity) {
        return promotionRepository.save(entity);
    }

    @Override
    public List<Promotion> saveAll(List<Promotion> entities) {
        return promotionRepository.saveAll(entities);
    }

    @Override
    public Promotion findById(Long aLong) {
        return promotionRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<Promotion> findAll() {
        return promotionRepository.findAll();
    }

    @Override
    public Promotion update(Promotion entity) {
        return promotionRepository.save(entity);
    }

    @Override
    public void delete(Promotion entity) {
        promotionRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        promotionRepository.deleteAll();
    }

    @Override
    public void deleteById(Long aLong) {
        promotionRepository.deleteById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return promotionRepository.existsById(aLong);
    }
}
