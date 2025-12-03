package tn.esprit.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.mappers.DetailCommandeMapper;
import tn.esprit.com.services.implementations.DetailCommandeService;

@RestController
@AllArgsConstructor
@RequestMapping("detail-commande")
public class DetailCommandeRC {
    DetailCommandeService detailCommandeService;
    DetailCommandeMapper detailCommandeMapper;
}
