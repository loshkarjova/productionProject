package org.example.app.repositories;

import org.example.app.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientsRepository extends JpaRepository<Client, Long> {

    Optional<Client> getClientById(Long id);
}
