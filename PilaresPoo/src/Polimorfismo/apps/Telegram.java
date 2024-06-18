package Polimorfismo.apps;

public class Telegram extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
		salvarHistoricoMensagem();
	}

	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem no Telegram");
	}
}
