package exercicioherois.repository;

import exercicioherois.model.Heroi;
import exercicioherois.model.Personagem;
import exercicioherois.model.Vilao;

import java.util.*;

public class PersonagemRepository {

    private List<Personagem> personagens = new ArrayList<>();

    public void inserir(Personagem personagem) {
        personagens.add(personagem);
    }

    public List<Personagem> listar(){
        return personagens;
    }
}
