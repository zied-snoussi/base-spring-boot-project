package tn.esprit.com.mappers;

import org.mapstruct.Mapper;
import tn.esprit.com.dtos.CommandeDto;
import tn.esprit.com.entities.Commande;

@Mapper( componentModel = "spring" )
public interface CommandeMapper extends BaseMapper<Commande, CommandeDto> {
}
