package usuarioFinal;

import dispositivo.Iphone;

public class CelularPessoa {
	public static void main(String[] args) {
		Iphone iphone = new Iphone();
		iphone.atualizarPagina();
		iphone.adicionarAba();
		iphone.exibirPagina();
		iphone.pausar();
		iphone.selecionarMusica();
		iphone.tocar();
		iphone.atender();
		iphone.ligar();
		iphone.inciarCorreioVoz();
	}
}
