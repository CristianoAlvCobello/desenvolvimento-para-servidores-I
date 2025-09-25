/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animes;

/**
 *
 * @author Cristiano
 */
public class Animes {
    private String nome;
    private String autor;
    private String dataLancamento;
    private int temporadas;
    
    //encapsulamento get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
     public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
     public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }
    
      public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public void mostrarInfo() {
        System.out.println("Anime: " + nome);
        System.out.println("Autor: " + autor);
        System.out.println("Data de Lancamento: " + dataLancamento);
        System.out.println("Temporadas: " + temporadas);
    }   
}


