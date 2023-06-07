package org.example.app.rest;

import lombok.RequiredArgsConstructor;
import org.example.app.dtos.ClientDTO;
import org.example.app.services.ClientsService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequiredArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientsController {

    private final ClientsService service;

    @GetMapping(value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> getById(@PathVariable("id") Long id) {
        ClientDTO clientById = service.getClientById(id);
        return ResponseEntity.ok().body(clientById);
    }

}
