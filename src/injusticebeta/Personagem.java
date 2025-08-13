/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package injusticebeta;

import java.util.List;

/**
 *
 * @author Aluno
 */
public abstract class Personagem {
    protected String nomeHeroi;
    protected Double poderLuta;
    protected Double nivelHP;
    protected Double nivelDefesa;
    protected Integer nivelResistencia;
    protected Double nivelStamina;
    protected Double nivelFuria;
    protected Double porcentagemFadiga;
    protected List<String> elementos; 
    protected List<Habilidades> habilidades;

    public Personagem() {
        this.nivelStamina = 0.0;
    }

    public String getNomeHeroi() {
        return nomeHeroi;
    }

    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }

    public Double getPoderLuta() {
        return poderLuta;
    }

    public void setPoderLuta(Double poderLuta) {
        this.poderLuta = poderLuta;
    }

    public Double getNivelHP() {
        return nivelHP;
    }

    public void setNivelHP(Double nivelHP) {
        this.nivelHP = nivelHP;
    }

    public Double getNivelDefesa() {
        return nivelDefesa;
    }

    public void setNivelDefesa(Double nivelDefesa) {
        this.nivelDefesa = nivelDefesa;
    }

    public Integer getNivelResistencia() {
        return nivelResistencia;
    }

    public void setNivelResistencia(Integer nivelResistencia) {
        this.nivelResistencia = nivelResistencia;
    }

    public Double getNivelStamina() {
        return nivelStamina;
    }

    public void setNivelStamina(Double nivelStamina) {
        this.nivelStamina += nivelStamina;
    }

    public Double getNivelFuria() {
        return nivelFuria;
    }

    public void setNivelFuria(Double nivelFuria) {
        this.nivelFuria = nivelFuria;
    }

    public Double getPorcentagemFadiga() {
        return porcentagemFadiga;
    }

    public void setPorcentagemFadiga(Double porcentagemFadiga) {
        this.porcentagemFadiga = porcentagemFadiga;
    }

    public List<String> getElementos() {
        return elementos;
    }

    public void setElementos(List<String> elementos) {
        this.elementos = elementos;
    }
    
    public List<Habilidades> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<Habilidades> habilidades) {
        this.habilidades = habilidades;
    }
    
    public abstract Personagem surgimento();
    
    public abstract void buffer(Double percentualBuffer);
    
    public abstract void transformacao(Double requisito, Double percentualBuffer); 
    
}
