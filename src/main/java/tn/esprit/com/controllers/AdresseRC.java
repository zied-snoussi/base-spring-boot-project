package tn.esprit.com.controllers;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.com.dtos.AdresseDto;
import tn.esprit.com.mappers.AdresseMapper;
import tn.esprit.com.services.implementations.AdresseService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("adresse")
@Tag(name = "Address Management", description = "APIs for managing addresses")
public class AdresseRC {

    AdresseService serviceAdresse;
    AdresseMapper adresseMapper;

    @GetMapping("/all")
    public ResponseEntity<List<AdresseDto>> getAllAdresses() {
        List<AdresseDto> adresses = adresseMapper.toDTO(serviceAdresse.findAll());
        return ResponseEntity.ok(adresses);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdresseDto> getAdresseById(@PathVariable String id) {
        AdresseDto adresse = adresseMapper.toDTO(serviceAdresse.findById(Long.parseLong(id)));
        return ResponseEntity.ok(adresse);
    }

    @PostMapping()
    public ResponseEntity<AdresseDto> createAdresse(@RequestBody AdresseDto adresse) {
        AdresseDto result = adresseMapper.toDTO(serviceAdresse.add(adresseMapper.toEntity(adresse)));
        return ResponseEntity.ok(result);
    }

    @DeleteMapping("/{id}")
    public String deleteAdresseById(@PathVariable String id) {
        serviceAdresse.deleteById(Long.parseLong(id));
        return "Adresse deleted successfully";
    }

    @PutMapping("/{id}")
    public ResponseEntity<AdresseDto> updateAdresseById(@RequestBody AdresseDto adresse, @PathVariable Long id) {
        adresse.setIdAdresse(id);
        AdresseDto result = adresseMapper.toDTO(serviceAdresse.update(adresseMapper.toEntity(adresse)));
        return ResponseEntity.ok(result);
    }
}
