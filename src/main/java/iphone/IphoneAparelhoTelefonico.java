package main.java.iphone;

public class IphoneAparelhoTelefonico implements AparelhoTelefonico{

	@Override
	public void ligar(String numero) {
		System.out.println("Ligando para o número: " + numero);
	}

	@Override
	public void atender() {
		System.out.println("Atendendo chamada");		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando correio de voz");
	}

}
