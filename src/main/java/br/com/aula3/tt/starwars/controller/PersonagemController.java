package br.com.aula3.tt.starwars.controller;

import br.com.aula3.tt.starwars.model.service.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aula3/tt")
public class PersonagemController {

    private PersonagemService personagemService;

    public PersonagemController() {
    }

    @Autowired
    public PersonagemController(PersonagemService personagemService) {
        this.personagemService = personagemService;
    }

    @GetMapping("/personagens/{nome}")
    public ResponseEntity<?> getNomesPersonagens(@PathVariable String nome) {
        return ResponseEntity.ok(personagemService.nomePersonagens(nome));
    }
}
