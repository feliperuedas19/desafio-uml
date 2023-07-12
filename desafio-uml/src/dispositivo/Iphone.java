package dispositivo;

import navegador.Navegador;
import reprodutor.Reprodutor;
import telefonico.Telefonico;

public class Iphone implements Navegador, Telefonico, Reprodutor {

	public void atualizarPagina() {
		System.out.println("ATUALIZANDO PAGINA PELO IPHONE");
	}
	public void adicionarAba() {
		System.out.println("ADICIONANDO ABA PELO IPHONE");
	}
	public void exibirPagina() {
		System.out.println("EXIBINDO PAGINA PELO IPHONE");
	}

	public void tocar() {
		System.out.println("TOCANDO PELO IPHONE");
	}
	public void selecionarMusica() {
		System.out.println("SELECIONANDO PELO IPHONE");		
	}
	public void pausar() {
		System.out.println("PAUSANDO PELO IPHONE");		
	}
	public void atender() {
		System.out.println("ATENDENDO PELO IPHONE");	
	}
	public void ligar() {
		System.out.println("LIGANDO PELO IPHONE");	
	}
	public void inciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO PELO IPHONE");	
	}

	
}


