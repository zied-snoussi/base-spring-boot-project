package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.CarteFidelite;
import tn.esprit.com.repositories.CarteFideliteRepository;
import tn.esprit.com.services.interfaces.ICarteFideliteService;

import java.util.List;

@Service
@AllArgsConstructor
public class CarteFideliteService implements ICarteFideliteService {
    CarteFideliteRepository carteFideliteRepository;

    @Override
    public CarteFidelite add(CarteFidelite entity) {
        return carteFideliteRepository.save(entity);
    }

    @Override
    public List<CarteFidelite> saveAll(List<CarteFidelite> entities) {
        return carteFideliteRepository.saveAll(entities);
    }

    @Override
    public CarteFidelite findById(Long aLong) {
        return carteFideliteRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<CarteFidelite> findAll() {
        return carteFideliteRepository.findAll();
    }

    @Override
    public CarteFidelite update(CarteFidelite entity) {
        return carteFideliteRepository.save(entity);
    }

    @Override
    public void delete(CarteFidelite entity) {
        carteFideliteRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        carteFideliteRepository.deleteAll();
    }

    @Override
    public void deleteById(Long aLong) {
        carteFideliteRepository.deleteById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return carteFideliteRepository.existsById(aLong);
    }
}
