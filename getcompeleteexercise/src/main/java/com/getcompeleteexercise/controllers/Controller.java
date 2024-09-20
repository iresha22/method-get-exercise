package com.getcompeleteexercise.controllers;

import com.getcompeleteexercise.entities.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class Controller {
    @GetMapping("/ciao/{provincia}")
    public User ciao(
            @RequestParam String nome,
            @PathVariable String provincia
    ){
        return new User(nome,provincia, "ciao " + nome + ", com'è il tempo in " + provincia + "?");
    }
}
