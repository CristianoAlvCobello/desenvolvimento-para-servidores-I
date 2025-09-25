/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Animes;

/**
 *
 * @author Cristiano
 */
public class Anime extends Animes {
    private int numeroDeEpisodios;
       
    public int getNumeroDeEpisodios() {
        return numeroDeEpisodios;
    }
    
    public void setNumeroDeEpisodios(int numeroDeEpisodios) {
        this.numeroDeEpisodios = numeroDeEpisodios;
    }
    
    public void personagemPrincipal(String personagemPrincipal) {
        System.out.println("Personagem Principal: " + personagemPrincipal);
    }
    
    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Quantidade de episodios: " + numeroDeEpisodios);
    }
}
