package tn.esprit.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.mappers.CarteFideliteMapper;
import tn.esprit.com.services.implementations.CarteFideliteService;

@RestController
@AllArgsConstructor
@RequestMapping("carte-fidelite")
public class CarteFideliteRC {

    CarteFideliteService serviceCarteFidelite;
    CarteFideliteMapper carteFideliteMapper;
}
