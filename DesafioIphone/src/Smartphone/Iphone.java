package Smartphone;

import apps.Musica.Ipod;

public class Iphone {
    public static void main(String[] args) throws Exception {
        //TODO Implementar funções do Iphone para abrir metodos dos aplicativos
        Ipod ipod = new Ipod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica("Aleatoria");
    }
}
