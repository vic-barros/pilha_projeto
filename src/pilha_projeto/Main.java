package pilha_projeto;

public class Main {
	
	 public static void main(String[] args) {
		
	System.out.println("------------1 PILHA------------");	
	
		 Pilha primeiraPilha = new Pilha (10);
		 for(int i = 0; i < 10; i++) {
			 primeiraPilha.inserirAleatorio(10);
		 }
			primeiraPilha.exibir();
	System.out.println("-------------------------------");		
	
	
	
	System.out.println("------------2 PILHA------------");	
	
		Pilha segundaPilha = new Pilha (11);
		for(int i = 0; i < 10; i++) {
			segundaPilha.inserirAleatorio(10);
		}
		   segundaPilha.exibir();
	System.out.println("-------------------------------");
	
	System.out.println("----COMPARAR TAMANHO/VALOR-----");
		 primeiraPilha.compararValores(segundaPilha);
		 
	System.out.println("-----------FIBONACCI-----------");
		Pilha pilhaFibonacci = new Pilha (10);
		pilhaFibonacci.inserirFibonacci();
		pilhaFibonacci.exibir();
	

	 }

	
}
