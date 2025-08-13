/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package injusticebeta;

/**
 *
 * @author Aluno
 */
public class CamposBatalha {
    private String nomeCenario;
    private Double turnosBatalha;
    private String elementoFavorecido;

    public CamposBatalha() {}

    public String getNomeCenario() {
        return nomeCenario;
    }

    public void setNomeCenario(String nomeCenario) {
        this.nomeCenario = nomeCenario;
    }

    public Double getTempoBatalha() {
        return turnosBatalha;
    }

    public void setTempoBatalha(Double tempoBatalha) {
        this.turnosBatalha = tempoBatalha;
    }

    public String getElementoFavorecido() {
        return elementoFavorecido;
    }

    public void setElementoFavorecido(String elementoFavorecido) {
        this.elementoFavorecido = elementoFavorecido;
    }
    
    public void batalha(Personagem heroi, Personagem vilao) {
        System.out.println("HERÓI:");
        System.out.println(heroi);
        System.out.println("VILÃO:");
        System.out.println(vilao);
    }
}
