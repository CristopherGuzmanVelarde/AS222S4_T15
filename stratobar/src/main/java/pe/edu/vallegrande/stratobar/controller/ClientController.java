package pe.edu.vallegrande.stratobar.controller;

import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.vallegrande.stratobar.model.Client;
import pe.edu.vallegrande.stratobar.service.ClientService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/clients")

public class ClientController {
    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<Client> addClient(@RequestBody Client client){
        return  ResponseEntity.ok(clientService.save(client));
    }
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients(){
        return ResponseEntity.ok(clientService.findAll());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable String id,@RequestBody Client client){
        return  ResponseEntity.ok(clientService.update(id, client));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable String id){
        clientService.delete(id);
        return  ResponseEntity.noContent().build();
    }
}
