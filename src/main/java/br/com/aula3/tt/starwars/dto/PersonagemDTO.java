package br.com.aula3.tt.starwars.dto;

import java.util.List;

public class PersonagemDTO {
    private List<String> names;

    public PersonagemDTO() {
    }

    public PersonagemDTO(List<String> names) {
        this.names = names;
    }

    public List<String> getNames() {
        return names;
    }
}
