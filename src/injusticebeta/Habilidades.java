/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package injusticebeta;

/**
 *
 * @author Aluno
 */
public class Habilidades {
    private String nomeHabilidade;
    private Integer tempoRecarga;
    private Double raioAlcance;
    private Double danoHabilidade;
    private Double porcentagemAtaque;
    private Double porcentagemDefesa;
    private Double porcentagemStamina;

    public Habilidades() {}

    public Double getPorcentagemAtaque() {
        return porcentagemAtaque;
    }

    public void setPorcentagemAtaque(Double porcentagemAtaque) {
        this.porcentagemAtaque = porcentagemAtaque;
    }

    public String getNomeHabilidade() {
        return nomeHabilidade;
    }

    public void setNomeHabilidade(String nomeHabilidade) {
        this.nomeHabilidade = nomeHabilidade;
    }

    public Integer getTempoRecarga() {
        return tempoRecarga;
    }

    public void setTempoRecarga(Integer tempoRecarga) {
        this.tempoRecarga = tempoRecarga;
    }

    public Double getRaioAlcance() {
        return raioAlcance;
    }

    public void setRaioAlcance(Double raioAlcance) {
        this.raioAlcance = raioAlcance;
    }

    public Double getDanoHabilidade() {
        return danoHabilidade;
    }

    public void setDanoHabilidade(Double danoHabilidade) {
        this.danoHabilidade = danoHabilidade;
    }

    public Double getPorcentagemDefesa() {
        return porcentagemDefesa;
    }

    public void setPorcentagemDefesa(Double porcentagemDefesa) {
        this.porcentagemDefesa = porcentagemDefesa;
    }

    public Double getPorcentagemStamina() {
        return porcentagemStamina;
    }

    public void setPorcentagemStamina(Double porcentagemStamina) {
        this.porcentagemStamina = porcentagemStamina;
    }
    
    public Double ataque(Double poderLuta, Double nivelStamina) throws Exception {
        if (nivelStamina < porcentagemStamina)
            throw new Exception("Nível de stamina insuficiente para usar essa habilidade!");
        else {
            this.danoHabilidade = this.porcentagemAtaque * poderLuta;
            return this.danoHabilidade;
        }
    }
    
    public Double defesa(Double nivelDefesa) {
        return nivelDefesa * this.porcentagemDefesa;
    }
    
    public void especial(Double poderLuta, Double nivelStamina) throws Exception {
    
    }
}
