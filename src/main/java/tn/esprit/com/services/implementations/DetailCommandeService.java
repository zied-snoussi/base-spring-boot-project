package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Detail_Commande;
import tn.esprit.com.repositories.DetailCommandeRepository;
import tn.esprit.com.services.interfaces.IDetailCommandeService;

import java.util.List;

@Service
@AllArgsConstructor
public class DetailCommandeService implements IDetailCommandeService {

    DetailCommandeRepository detailCommandeRepository;

    @Override
    public Detail_Commande add(Detail_Commande entity) {
        return detailCommandeRepository.save(entity);
    }

    @Override
    public List<Detail_Commande> saveAll(List<Detail_Commande> entities) {
        return detailCommandeRepository.saveAll(entities);
    }

    @Override
    public Detail_Commande findById(Long aLong) {
        return detailCommandeRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<Detail_Commande> findAll() {
        return detailCommandeRepository.findAll();
    }

    @Override
    public Detail_Commande update(Detail_Commande entity) {
        return detailCommandeRepository.save(entity);
    }

    @Override
    public void delete(Detail_Commande entity) {
        detailCommandeRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        detailCommandeRepository.deleteAll();
    }

    @Override
    public void deleteById(Long aLong) {
        detailCommandeRepository.deleteById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return detailCommandeRepository.existsById(aLong);
    }
}
