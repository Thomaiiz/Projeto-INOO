package models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import entitites.Estudante;

public class Avaliacao {
    private String nome;
    private double peso;
    private DateTimeFormatter data;
    
    private Map<Estudante, Double> notas; 

    public Avaliacao(String nome, double peso, DateTimeFormatter data) {
        this.nome = nome;
        this.peso = peso;
        this.data = data;
        this.notas = new HashMap<>();
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public DateTimeFormatter getData() {
        return data;
    }

    public void setData(DateTimeFormatter data) {
        this.data = data;
    }

    public Map<Estudante, Double> getNotas() {
        return notas;
    }

    public void adicionarNota(Estudante estudante, double nota) {
        this.notas.put(estudante, nota);
    }
}
