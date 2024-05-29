import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class SelecionarCandidatos {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo: Seleção de Candidatos");
        //analisarCandidato();
        //selecaoCandidatos();
        //imprimirSelecionados();
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
        
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
        
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean atendeu = false;
        boolean continuarTentando = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO!");

        } while (continuarTentando && tentativasRealizadas < 3);
        
        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS DE " + tentativasRealizadas + " REALIZADAS");
    }

    static boolean atender(){
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

        for(int indice = 0; indice < candidatos.length; indice++){
            System.out.println("O(A) candidato de número " + (indice + 1) + " é: " + candidatos[indice]);
        }

        System.out.println("Imprimindo a lista de candidatos de forma abreviada for each");

        for (String candidatoString : candidatos) {
            System.out.println("O(A) candidato é: " + candidatoString);
        }
    }

    static void selecaoCandidatos(){
        // Array com a lista de candidatos

        String [] candidatos = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O Candidato "+ candidato + " Solicitou Este Valor de Salário R$ " + salarioPretendido);
            if (salarioPretendido < salarioBase){
                System.out.println("O Candidato " + candidato + " Foi Selecionado para a Vaga!");
                candidatosSelecionados ++;
            }
            candidatosAtual ++;
        }
    }

    /**
     * @param valorPretendido retorna um double aleatório de 1800 à 2200.
     * 
     */
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(Double salarioPretendido){
        Double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        }  else if (salarioBase.equals(salarioPretendido)) {
            //.equals() é a forma correta de comparar valores em double
            System.out.println("Ligar para o Candidato com Contra Proposta");
        } else {
            System.out.println("Aguardar o Resultado dos Demais Candidatos");
        }
    }
}
