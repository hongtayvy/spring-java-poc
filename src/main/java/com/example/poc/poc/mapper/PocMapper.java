package com.example.poc.poc.mapper;

import com.example.poc.common.client.dto.TypesDTO;
import com.example.poc.poc.model.Types;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class PocMapper {
    Logger logger = LoggerFactory.getLogger(PocMapper.class);
    public Types toTypes(TypesDTO typesDTO){
        logger.info("Mapping dto values to model");
        return new Types(typesDTO.getTypes());
    }

    public com.example.poc.poc.dto.TypesDTO toTypesDTO(Types types){
        logger.info("Mapping model values to dto");
        return new com.example.poc.poc.dto.TypesDTO(types.getTypes());
    }
}
