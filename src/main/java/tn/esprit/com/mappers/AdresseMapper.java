package tn.esprit.com.mappers;

import org.mapstruct.Mapper;
import tn.esprit.com.dtos.AdresseDto;
import tn.esprit.com.entities.Adresse;

@Mapper( componentModel = "spring" )
public interface AdresseMapper extends BaseMapper<Adresse, AdresseDto> {

}
