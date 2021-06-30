package dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import entity.Person;
import dto.PersonDTO;

@Mapper(componentModel = "spring")
public interface PersonMapper {

    @Mapping(target = "birthDate", source = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO dto);

    PersonDTO toDTO(Person dto);
}
