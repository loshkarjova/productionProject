package org.example.app.services;

import org.example.app.dtos.ClientDTO;

public interface ClientsService {
    ClientDTO getClientById(Long id);
}
