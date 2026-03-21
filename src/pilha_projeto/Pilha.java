package pilha_projeto;


public class Pilha {
	
	int[] elementos;
	int topo;
	
	public Pilha(int tamanho) {
		elementos = new int [tamanho];
		topo = -1;
	}
	
	void inserir(int valor) {
		topo++;
		elementos[topo] = valor;
	}
	
	void remover() {
		topo--;
	}
	
	void exibir() {
		for(int i = topo; i >= 0; i--) {
			System.out.println("A pilha segue a ordem: " + elementos[i]);
		}
	}
	
	double media() {
		double soma = 0;
		for(int i = 0; i <= topo; i++) {
			soma = soma + elementos[i];
		}
		return soma / (topo +1);
	}
	
	int maior() {
		int numeroMaior = elementos[0];
		for(int i = 0; i <= topo; i++) {
			if(elementos[i] > numeroMaior) {
				numeroMaior = elementos[i];
			}
		}
		return numeroMaior;
	}
	
	int menor() {
		int numeroMenor = elementos[0];
		for(int i = 0; i <= topo; i++) {
			if(elementos[i] < numeroMenor) {
				numeroMenor = elementos[i];
			}
		}
		return numeroMenor;
	}
	
	void ordenarCrescente() {
	    int[] copia = elementos.clone();

	    for (int i = 0; i <= topo; i++) {
	        for (int j = 0; j < topo; j++) {
	            if (copia[j] > copia[j + 1]) {
	                int temp = copia[j];
	                copia[j] = copia[j + 1];
	                copia[j + 1] = temp;
	            }
	        }
	    }

	    System.out.println("--- Ordem Crescente ---");
	    for (int i = 0; i <= topo; i++) {
	        System.out.println(copia[i]);
	    }
	}
	
	void ordenarDecrescente() {
	    int[] copia = elementos.clone();

	    for (int i = 0; i <= topo; i++) {
	        for (int j = 0; j < topo; j++) {
	            if (copia[j] < copia[j + 1]) {
	                int temp = copia[j];
	                copia[j] = copia[j + 1];
	                copia[j + 1] = temp;
	            }
	        }
	    }

	    System.out.println("--- Ordem Decrescente ---");
	    for (int i = 0; i <= topo; i++) {
	        System.out.println(copia[i]);
	    }
	}

}
