package com.example.poc.poc.mapper;

import com.example.poc.client.genshin.dto.TypesDTO;
import com.example.poc.poc.model.Types;

public class PocMapper {
    public Types toTypes(TypesDTO typesDTO){
        return new Types(typesDTO.getTypes());
    }
}
