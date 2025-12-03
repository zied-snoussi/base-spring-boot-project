package tn.esprit.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.mappers.CommandeMapper;
import tn.esprit.com.services.implementations.CommandeService;

@RestController
@AllArgsConstructor
@RequestMapping("commande")
public class CommandeRC {

    CommandeService commandeService;
    CommandeMapper commandeMapper;
}
