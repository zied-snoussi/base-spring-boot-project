package tn.esprit.com.mappers;

import org.mapstruct.Mapper;
import tn.esprit.com.dtos.CarteFideliteDto;
import tn.esprit.com.entities.CarteFidelite;

@Mapper( componentModel = "spring" )
public interface CarteFideliteMapper extends BaseMapper<CarteFidelite, CarteFideliteDto> {
}
