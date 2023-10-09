package com.example.poc.poc;

import com.example.poc.poc.model.Types;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@Controller
@RestController("value = /poc")
public class PocController {
    private final PocService pocService = new PocService();
    @GetMapping
    public Mono<Types> getElementalData(){
        return pocService.getTypes();
    }
}
