/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Animes;

/**
 *
 * @author Cristiano
 */
public class TestaAnimes {
    
    public static void main(String[] args) {
        //Naruto
        Anime a1 = new Anime();
        a1.setNome("Naruto");
        a1.setAutor("Masashi Kishimoto");
        a1.setDataLancamento("03/10/2002");
        a1.setTemporadas(21);
        a1.setNumeroDeEpisodios(720);
        a1.mostrarInfo();
        a1.personagemPrincipal("Naruto");
        System.out.println();
        
        //Attack on Titan
        Anime a2 = new Anime();
        a2.setNome("Attack on Titan");
        a2.setAutor("Hajime Isayama");
        a2.setDataLancamento("15/02/2007");
        a2.setTemporadas(4);
        a2.setNumeroDeEpisodios(87);
        a2.mostrarInfo();
        a2.personagemPrincipal("Eren");
        System.out.println();
        
        //Dragon Ball Z
        Anime a3 = new Anime();
        a3.setNome("Dragon Ball Z");
        a3.setAutor("Akira Toriyama");
        a3.setDataLancamento("26/04/1989");
        a3.setTemporadas(9);
        a3.setNumeroDeEpisodios(291);
        a3.mostrarInfo();
        a3.personagemPrincipal("Goku");
        System.out.println();

        //One Piece
        Anime a4 = new Anime();
        a4.setNome("One Piece");
        a4.setAutor("Eiichiro Oda");
        a4.setDataLancamento("20/10/1999");
        a4.setTemporadas(20);
        a4.setNumeroDeEpisodios(1080);
        a4.mostrarInfo();
        a4.personagemPrincipal("Luffy");
        System.out.println();

        //Death Note
        Anime a5 = new Anime();
        a5.setNome("Death Note");
        a5.setAutor("Tsugumi Ohba");
        a5.setDataLancamento("03/10/2006");
        a5.setTemporadas(1);
        a5.setNumeroDeEpisodios(37);
        a5.mostrarInfo();
        a5.personagemPrincipal("Light Yagami");
        System.out.println();

        //Fullmetal Alchemist: Brotherhood
        Anime a6 = new Anime();
        a6.setNome("Fullmetal Alchemist: Brotherhood");
        a6.setAutor("Hiromu Arakawa");
        a6.setDataLancamento("05/04/2009");
        a6.setTemporadas(1);
        a6.setNumeroDeEpisodios(64);
        a6.mostrarInfo();
        a6.personagemPrincipal("Edward Elric");
        System.out.println();

        //Bleach
        Anime a7 = new Anime();
        a7.setNome("Bleach");
        a7.setAutor("Tite Kubo");
        a7.setDataLancamento("05/10/2004");
        a7.setTemporadas(16);
        a7.setNumeroDeEpisodios(366);
        a7.mostrarInfo();
        a7.personagemPrincipal("Ichigo Kurosaki");
        System.out.println();

        //Demon Slayer
        Anime a8 = new Anime();
        a8.setNome("Demon Slayer");
        a8.setAutor("Koyoharu Gotouge");
        a8.setDataLancamento("06/04/2019");
        a8.setTemporadas(3);
        a8.setNumeroDeEpisodios(55);
        a8.mostrarInfo();
        a8.personagemPrincipal("Tanjiro Kamado");
        System.out.println();

        //My Hero Academia
        Anime a9 = new Anime();
        a9.setNome("My Hero Academia");
        a9.setAutor("Kohei Horikoshi");
        a9.setDataLancamento("03/04/2016");
        a9.setTemporadas(6);
        a9.setNumeroDeEpisodios(138);
        a9.mostrarInfo();
        a9.personagemPrincipal("Izuku Midoriya");
        System.out.println();

        //Hunter x Hunter
        Anime a10 = new Anime();
        a10.setNome("Hunter x Hunter");
        a10.setAutor("Yoshihiro Togashi");
        a10.setDataLancamento("16/10/1999");
        a10.setTemporadas(6);
        a10.setNumeroDeEpisodios(148);
        a10.mostrarInfo();
        a10.personagemPrincipal("Gon Freecss");
        System.out.println();
    }
}
