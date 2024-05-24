public class CaixaEletronico {
    public static void main(String[] args) throws Exception {
        
        Double saldo = 25.0;
        Double valorSolicitado = 17.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;            
        }

        System.out.println(saldo);

    }
}
