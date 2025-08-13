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
    private Double turnosBatalha = 0.0;
    private String elementosFavorecido;

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
        return elementosFavorecido;
    }

    public void setElementoFavorecido(String elementoFavorecido) {
        this.elementosFavorecido = elementoFavorecido;
    }
    
    public void batalha(Double bufferElementoCenario, Personagem heroi, Personagem vilao) {
        this.elementosFavorecido
        System.out.println("HERÓI:");
        System.out.println(heroi);
        System.out.println("VILÃO:");
        System.out.println(vilao);
    }
}
