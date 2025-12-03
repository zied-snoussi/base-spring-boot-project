package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Commande;
import tn.esprit.com.services.interfaces.ICommandeService;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {
    @Override
    public Commande add(Commande entity) {
        return null;
    }

    @Override
    public List<Commande> saveAll(List<Commande> entities) {
        return List.of();
    }

    @Override
    public Commande findById(Long aLong) {
        return null;
    }

    @Override
    public List<Commande> findAll() {
        return List.of();
    }

    @Override
    public Commande update(Commande entity) {
        return null;
    }

    @Override
    public void delete(Commande entity) {

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
