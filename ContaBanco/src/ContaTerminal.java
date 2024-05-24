import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        
        System.out.println("Digite o seu primeiro nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Digite o seu sobrenome: ");
        String sobrenomeCliente = scanner.next();
        scanner.close();

        Double saldo = 1520.55;

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco\nSua agência é: " + agencia + "\nConta: " + numero + "\nSeu saldo R$ " + saldo + " já está disponível para saque!.");
    }
}
