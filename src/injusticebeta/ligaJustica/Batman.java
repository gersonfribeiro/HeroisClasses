/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package injusticebeta.ligaJustica;

import injusticebeta.Habilidades;
import injusticebeta.Personagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Batman extends Personagem {

    public Batman() {}

    @Override
    public Personagem surgimento() {
        this.setNomeHeroi("Batman");
        this.setPoderLuta(530.5);
        this.setNivelHP(2000.0);
        this.setNivelDefesa(230.3);
        this.setNivelResistencia(4);
        this.setNivelStamina(20.0);
        this.setPorcentagemFadiga(5.0);
        
        List<String> elementos = new ArrayList<>();
        elementos.add("NOTURNO");
        this.setElementos(elementos);
        
        List<Habilidades> habilidadesBatman = new ArrayList<>();
        Habilidades batRangue = new Habilidades();
        batRangue.setNomeHabilidade("batRangue");
        batRangue.setTempoRecarga(1);
        batRangue.setRaioAlcance(10.0);
        batRangue.setPorcentagemAtaque(20.5);
        batRangue.setPorcentagemDefesa(5.2);
        habilidadesBatman.add(batRangue);
        this.setHabilidades(habilidadesBatman);
        
        return this;
    };
}
