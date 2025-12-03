package tn.esprit.com.mappers;

import org.mapstruct.Mapper;
import tn.esprit.com.dtos.ClientDto;
import tn.esprit.com.entities.Client;

@Mapper( componentModel = "spring" )
public interface ClientMapper extends BaseMapper<Client, ClientDto> {
}
