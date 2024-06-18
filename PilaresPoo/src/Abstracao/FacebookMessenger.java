package Abstracao;

public class FacebookMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem");
        salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem");
		salvarHistoricoMensagem();
	}
    //Metodo privado, não precisa ser mostrado em outros locais
	private void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
    //Metodo privado, não precisa ser mostrado em outros locais
	private void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem");
	}
}
