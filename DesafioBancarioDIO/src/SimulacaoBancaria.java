import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {

            System.out.println("Escolha a Opção:\n1. Depositar\n2. Sacar\n3. Consultar Saldo:\n0. Encerrar");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    System.out.println("Digite o valor a ser depoisitado: ");
                    double depositado = scanner.nextDouble();
                    saldo = saldo + depositado;
                    System.out.println("Saldo Atual: R$ " + saldo );
                    //System.out.println("Deseja continuar?\nDigite 1 para continuar e 2 para finalizar?");
                    //int opcaoContinuar = scanner.nextInt();
                    //if(opcaoContinuar == 2){
                        //System.out.println("Programa encerrado.");
                        //continuar = false;
                    //}
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    System.out.println("Informe o valor a ser sacado: ");
                    double valorSacar = scanner.nextDouble();
                    if(valorSacar > saldo){
                        System.out.println("Saldo Insuficiente.");
                    } else {
                        saldo = saldo - valorSacar;
                        System.out.println("Saldo Atual: R$ " + saldo);
                    }
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.println("Saldo Atual: R$ " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
    
}
