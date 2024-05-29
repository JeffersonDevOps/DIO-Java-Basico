public class Candidatura {
    public static void main(String[] args) throws Exception {
        System.out.println("Processo Seletivo");

        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        
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
