package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.CarteFidelite;
import tn.esprit.com.services.interfaces.ICarteFideliteService;

import java.util.List;

@Service
@AllArgsConstructor
public class CarteFideliteService implements ICarteFideliteService {
    @Override
    public CarteFidelite add(CarteFidelite entity) {
        return null;
    }

    @Override
    public List<CarteFidelite> saveAll(List<CarteFidelite> entities) {
        return List.of();
    }

    @Override
    public CarteFidelite findById(Long aLong) {
        return null;
    }

    @Override
    public List<CarteFidelite> findAll() {
        return List.of();
    }

    @Override
    public CarteFidelite update(CarteFidelite entity) {
        return null;
    }

    @Override
    public void delete(CarteFidelite entity) {

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
