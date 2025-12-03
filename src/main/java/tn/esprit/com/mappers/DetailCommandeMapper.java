package tn.esprit.com.mappers;

import org.mapstruct.Mapper;
import tn.esprit.com.dtos.DetailCommandeDto;
import tn.esprit.com.entities.Detail_Commande;

@Mapper( componentModel = "spring" )
public interface DetailCommandeMapper extends BaseMapper<Detail_Commande, DetailCommandeDto> {
}
