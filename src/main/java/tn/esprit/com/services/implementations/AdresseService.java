package tn.esprit.com.services.implementations;

import tn.esprit.com.entities.Adresse;
import tn.esprit.com.services.interfaces.IAdresseService;

import java.util.List;

public class AdresseService implements IAdresseService {
    @Override
    public Adresse add(Adresse entity) {
        return null;
    }

    @Override
    public List<Adresse> saveAll(List<Adresse> entities) {
        return List.of();
    }

    @Override
    public Adresse findById(Long aLong) {
        return null;
    }

    @Override
    public List<Adresse> findAll() {
        return List.of();
    }

    @Override
    public Adresse update(Adresse entity) {
        return null;
    }

    @Override
    public void delete(Adresse entity) {

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
