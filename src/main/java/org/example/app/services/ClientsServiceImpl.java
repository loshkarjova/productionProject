package org.example.app.services;

import lombok.RequiredArgsConstructor;
import org.example.app.dtos.ClientDTO;
import org.example.app.exceptions.EntityNotFoundException;
import org.example.app.models.Client;
import org.example.app.repositories.ClientsRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientsServiceImpl implements ClientsService {

    private final ClientsRepository repository;

    @Override
    public ClientDTO getClientById(Long id) {

        Client client = repository.getClientById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format(
                        "Client with ID %s not found", id
                )));

        ClientDTO clientDTO = new ClientDTO();
        clientDTO.setId(client.getId());
        clientDTO.setFirstName(client.getFirstName());
        clientDTO.setLastName(client.getLastName());
        clientDTO.setPhone(client.getPhone());
        return clientDTO;
    }
}
