package br.com.aula3.tt.starwars.model.service;

import br.com.aula3.tt.starwars.dto.PersonagemDTO;
import br.com.aula3.tt.starwars.model.repository.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonagemService {

    private PersonagemRepository personagemRepository;

    public PersonagemService() {
    }

    @Autowired
    public PersonagemService(PersonagemRepository personagemRepository) {
        this.personagemRepository = personagemRepository;
    }

    public PersonagemDTO nomePersonagens(String nome) {
        List<String> nomes = personagemRepository.nomePersonagem(nome.toLowerCase());
        PersonagemDTO personagens = new PersonagemDTO(nomes);
        return personagens;
    }
}
