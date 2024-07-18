package apps;

import apps.Telefone.AparelhoTelefonico;

public class Phone implements AparelhoTelefonico {

    @Override
    public void atender() {
        System.out.println("Atendendo a ligação em Phone!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz em Phone!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando em Phone para o número: " + numero);
    }

    @Override
    public void desligar(){
        System.out.println("Finalizando chamada do Phone");
    }
}
