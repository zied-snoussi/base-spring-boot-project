package tn.esprit.com.mappers;

import org.mapstruct.Mapper;
import tn.esprit.com.dtos.ArticleDto;
import tn.esprit.com.entities.Article;

@Mapper( componentModel = "spring" )
public interface ArticleMapper extends BaseMapper<Article, ArticleDto> {
}
