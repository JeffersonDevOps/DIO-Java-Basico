package Polimorfismo.apps;
public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSNMessenger");
		salvarHistoricoMensagem();
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSNMessenger");
		salvarHistoricoMensagem();
	}

	public void salvarHistoricoMensagem() {
		System.out.println("Salvando o histórico da mensagem no MSNMessenger");
	}
	
    
}