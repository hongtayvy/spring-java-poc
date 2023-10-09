package com.example.poc.client.genshin.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TypesDTO {
    String [] types;

    public String[] getTypes(){
        return  this.types;
    }
}
