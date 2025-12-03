package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Adresse;
import tn.esprit.com.repositories.AdresseRepository;
import tn.esprit.com.services.interfaces.IAdresseService;

import java.util.List;

@Service
@AllArgsConstructor
public class AdresseService implements IAdresseService {

    AdresseRepository adresseRepository;

    @Override
    public Adresse add(Adresse entity) {
        return adresseRepository.save(entity);
    }

    @Override
    public List<Adresse> saveAll(List<Adresse> entities) {
        return adresseRepository.saveAll(entities);
    }

    @Override
    public Adresse findById(Long aLong) {
        return adresseRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<Adresse> findAll() {
        return adresseRepository.findAll();
    }

    @Override
    public Adresse update(Adresse entity) {
        return adresseRepository.save(entity);
    }

    @Override
    public void delete(Adresse entity) {
        adresseRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        adresseRepository.deleteAll();
    }

    @Override
    public void deleteById(Long aLong) {
        adresseRepository.deleteById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return adresseRepository.existsById(aLong);
    }
}
