package pe.edu.vallegrande.stratobar.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.stratobar.model.Client;
import pe.edu.vallegrande.stratobar.repository.ClientRepository;
import pe.edu.vallegrande.stratobar.service.ClientService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client save(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client update(String id, Client client) {
        return clientRepository.findById(id)
                .map(res -> {
                    res.setName(client.getName());
                    res.setLast_names(client.getLast_names());
                    res.setCellphone(client.getCellphone());
                    res.setType_document(client.getType_document());
                    res.setNumber_document(client.getNumber_document());
                    res.setEmail(client.getEmail());
                    res.setBirthdate(client.getBirthdate());
                    res.setActive(client.getActive());
                    return clientRepository.save(res);
                }).orElseThrow();
    }

    @Override
    public List<Client> findAll() {
        return clientRepository.findAll();
    }

    @Override
    public void delete(String id) {
        clientRepository.findById(id).ifPresent(clientRepository::delete);
    }
}
