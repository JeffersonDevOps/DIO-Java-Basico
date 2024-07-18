package apps;

import apps.Musica.ReprodutorMusical;
import apps.Video.ReprodutorVideo;

public class Ipod implements ReprodutorMusical, ReprodutorVideo{
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
        System.out.println("Selecionando Musica: " + musica);
    }

    //Reproduzindo Video
    @Override
    public void reproduzirVideo(){
        checarInternet();
        System.out.println("Reproduzindo Video no IPOD!");
    }
    @Override
    public void pausarVideo(){
        checarInternet();
        System.out.println("Pausando vídeo no IPOD!");
    }
    @Override
    public void selecionarVideo(String video){
        checarInternet();
        System.out.println("Selecionando Video no IPOD: " + video);
    }

}