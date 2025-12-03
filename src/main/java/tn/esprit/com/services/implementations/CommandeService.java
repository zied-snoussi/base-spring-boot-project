package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Commande;
import tn.esprit.com.repositories.CommandeRepository;
import tn.esprit.com.services.interfaces.ICommandeService;

import java.util.List;

@Service
@AllArgsConstructor
public class CommandeService implements ICommandeService {
    CommandeRepository commandeRepository;

    @Override
    public Commande add(Commande entity) {
        return commandeRepository.save(entity);
    }

    @Override
    public List<Commande> saveAll(List<Commande> entities) {
        return commandeRepository.saveAll(entities);
    }

    @Override
    public Commande findById(Long aLong) {
        return commandeRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public Commande update(Commande entity) {
        return commandeRepository.save(entity);
    }

    @Override
    public void delete(Commande entity) {
        commandeRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        commandeRepository.deleteAll();
    }

    @Override
    public void deleteById(Long aLong) {
        commandeRepository.deleteById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return commandeRepository.existsById(aLong);
    }
}
