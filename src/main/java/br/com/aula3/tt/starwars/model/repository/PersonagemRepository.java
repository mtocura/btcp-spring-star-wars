package br.com.aula3.tt.starwars.model.repository;

import br.com.aula3.tt.starwars.model.entity.Personagem;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersonagemRepository {
    private static final File FILE = new File("starwars.json");

    @Autowired
    private ObjectMapper mapper;

    public List<Personagem> getAll(){
        List<Personagem> personagens = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<Personagem>> typeReference = new TypeReference<List<Personagem>>() {};
            personagens = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personagens;
    }

    public List<String> nomePersonagem(String nome) {
        List<Personagem> personagens = getAll();
        List<String> nomes = new ArrayList<>();

        for (Personagem personagem : personagens) {
            if(personagem.getName().toLowerCase().contains(nome)) {
                nomes.add(personagem.getName());
            }
        }

        return nomes;
    }
}
