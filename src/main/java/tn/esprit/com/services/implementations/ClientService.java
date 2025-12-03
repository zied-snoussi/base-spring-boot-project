package tn.esprit.com.services.implementations;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.com.entities.Client;
import tn.esprit.com.repositories.ClientRepository;
import tn.esprit.com.services.interfaces.IClientService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService {
    ClientRepository clientRepository;

    @Override
    public Client add(Client entity) {
        return clientRepository.save(entity);
    }

    @Override
    public List<Client> saveAll(List<Client> entities) {
        return clientRepository.saveAll(entities);
    }

    @Override
    public Client findById(Long aLong) {
        return clientRepository.findById(aLong).orElse(null);
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public Client update(Client entity) {
        return clientRepository.save(entity);
    }

    @Override
    public void delete(Client entity) {
        clientRepository.delete(entity);
    }

    @Override
    public void deleteAll() {
        clientRepository.deleteAll();
    }

    @Override
    public void deleteById(Long aLong) {
        clientRepository.deleteById(aLong);
    }

    @Override
    public boolean existsById(Long aLong) {
        return clientRepository.existsById(aLong);
    }
}
