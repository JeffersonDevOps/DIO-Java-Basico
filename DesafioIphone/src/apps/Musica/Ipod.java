package apps.Musica;

public class Ipod implements ReprodutorMusical {
    @Override
    public void checarInternet(){
        System.out.println("Verificando Internet no Ipod!");
    };

    @Override
    public void tocar(){
        checarInternet();
        System.out.println("Tocando Música do IPOD!");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Música no IPOD!");
    }

    @Override
    public void selecionarMusica(String musica) {
        //musica = "Aleatoria";
        checarInternet();
        System.out.println("Tocando Musica: " + musica);
    }

    
    
}