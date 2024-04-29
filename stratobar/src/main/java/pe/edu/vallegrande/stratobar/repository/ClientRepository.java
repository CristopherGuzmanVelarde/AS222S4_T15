package pe.edu.vallegrande.stratobar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.stratobar.model.Client;

public interface ClientRepository extends JpaRepository<Client, String> {
}
