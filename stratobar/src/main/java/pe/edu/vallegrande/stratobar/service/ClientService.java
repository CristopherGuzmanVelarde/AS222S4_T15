package pe.edu.vallegrande.stratobar.service;

import pe.edu.vallegrande.stratobar.model.Client;

import java.util.List;

public interface ClientService {
    Client save (Client client);
    Client update (String id,Client client);
    List<Client> findAll();
    void delete(String id);
}
