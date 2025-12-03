package tn.esprit.com.mappers;

import org.mapstruct.Mapper;
import tn.esprit.com.dtos.PromotionDto;
import tn.esprit.com.entities.Promotion;

@Mapper( componentModel = "spring" )
public interface PromotionMapper extends BaseMapper<Promotion, PromotionDto> {
}
