package tn.esprit.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.mappers.ClientMapper;
import tn.esprit.com.services.implementations.ClientService;

@RestController
@AllArgsConstructor
@RequestMapping("client")
public class ClientRC {

    ClientService clientService;
    ClientMapper clientMapper;
}
