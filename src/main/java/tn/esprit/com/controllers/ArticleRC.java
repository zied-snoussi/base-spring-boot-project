package tn.esprit.com.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.com.mappers.ArticleMapper;
import tn.esprit.com.services.implementations.ArticleService;

@RestController
@AllArgsConstructor
@RequestMapping("article")
public class ArticleRC {

    ArticleService articleService;
    ArticleMapper articleMapper;
}
