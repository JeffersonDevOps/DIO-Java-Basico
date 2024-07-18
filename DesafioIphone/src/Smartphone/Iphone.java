package Smartphone;

import apps.Ipod;
import apps.Phone;
import apps.Safari;

public class Iphone {
    public static void main(String[] args) throws Exception {
        
        Ipod ipod = new Ipod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica("Aleatoria");
        ipod.reproduzirVideo();
        ipod.pausarVideo();
        ipod.selecionarVideo("Friends Episodio Aleatorio");

        Phone telefone = new Phone();
        telefone.atender();
        telefone.desligar();
        telefone.ligar("123456789");
        telefone.desligar();
        telefone.iniciarCorreioVoz();

        Safari safari = new Safari();
        safari.adicionarNovaAba();
        safari.exibirPagina("Google.com");
        safari.atualizarPagina();
    }
}
