package main.java.iphone;

public class IphoneNavegadorInternet implements NavegadorInternet{

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo página: " + url);
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

}
