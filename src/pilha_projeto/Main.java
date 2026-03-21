package pilha_projeto;

public class Main {
	
	 public static void main(String[] args) {
		 Pilha primeiraPilha = new Pilha (30);
			primeiraPilha.inserir(10);
			primeiraPilha.inserir(20);
			primeiraPilha.inserir(30);
			primeiraPilha.exibir();
			primeiraPilha.remover();
			primeiraPilha.exibir();
			
			System.out.println("A média dos valores da pilha é: " + primeiraPilha.media());
			System.out.println("Número Maior: " + primeiraPilha.maior());
			System.out.println("Número Menor: " + primeiraPilha.menor());
			
			primeiraPilha.ordenarCrescente();
			primeiraPilha.ordenarDecrescente();
			

	 }

	
}
