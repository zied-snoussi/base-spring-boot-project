package tn.esprit.com.services.implementations;

import tn.esprit.com.entities.Client;
import tn.esprit.com.services.interfaces.IClientService;

import java.util.List;

public class ClientService implements IClientService {
    @Override
    public Client add(Client entity) {
        return null;
    }

    @Override
    public List<Client> saveAll(List<Client> entities) {
        return List.of();
    }

    @Override
    public Client findById(Long aLong) {
        return null;
    }

    @Override
    public List<Client> findAll() {
        return List.of();
    }

    @Override
    public Client update(Client entity) {
        return null;
    }

    @Override
    public void delete(Client entity) {

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
