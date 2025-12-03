package tn.esprit.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.dtos.AdresseDto;
import tn.esprit.com.mappers.AdresseMapper;
import tn.esprit.com.services.implementations.AdresseService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("adresse")
public class AdresseRC {

    AdresseService serviceAdresse;
    AdresseMapper adresseMapper;

    @GetMapping
    public ResponseEntity<List<AdresseDto>> getAllAdresses() {
        List<AdresseDto> adresses = adresseMapper.toDTO(serviceAdresse.findAll());
        return ResponseEntity.ok(adresses);
    }
}
