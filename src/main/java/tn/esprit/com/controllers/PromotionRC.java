package tn.esprit.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.mappers.PromotionMapper;
import tn.esprit.com.services.implementations.PromotionService;

@RestController
@AllArgsConstructor
@RequestMapping("promotion")
public class PromotionRC {
    PromotionService promotionService;
    PromotionMapper promotionMapper;
}
