package tn.esprit.com.services.implementations;

import tn.esprit.com.entities.Detail_Commande;
import tn.esprit.com.services.interfaces.IDetailCommandeService;

import java.util.List;

public class DetailCommandeService implements IDetailCommandeService {
    @Override
    public Detail_Commande add(Detail_Commande entity) {
        return null;
    }

    @Override
    public List<Detail_Commande> saveAll(List<Detail_Commande> entities) {
        return List.of();
    }

    @Override
    public Detail_Commande findById(Long aLong) {
        return null;
    }

    @Override
    public List<Detail_Commande> findAll() {
        return List.of();
    }

    @Override
    public Detail_Commande update(Detail_Commande entity) {
        return null;
    }

    @Override
    public void delete(Detail_Commande entity) {

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
