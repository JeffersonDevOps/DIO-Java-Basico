package apps;

import apps.Internet.NavegadorInternet;

public class Safari implements NavegadorInternet{

    @Override
    public void exibirPagina(String urlPagina) {
        checarInternet();
        System.out.println("Exibindo pagina no Safari: " + urlPagina);
    }

    @Override
    public void adicionarNovaAba() {
        checarInternet();
        System.out.println("Adicionando nova aba no Safari!");
    }

    @Override
    public void atualizarPagina() {
        checarInternet();
        System.out.println("Atualizando Pagina no Safari!");
    }

    @Override
    public void checarInternet() {
        System.out.println("Verificando Internet para Navegador Safari!");
    }
    
}
