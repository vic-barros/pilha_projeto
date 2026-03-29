package pilha_projeto;
import java.util.Random;

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
	
	void inserirAleatorio(int tamanhoPilha) {
		Random rand = new Random();
		topo++;
		elementos[topo] = rand.nextInt(tamanhoPilha) + 1;
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
	
	void compararValores(Pilha outraPilha) {
	    if (topo != outraPilha.topo) {
	        System.out.println("Pilhas com tamanhos diferentes, impossível comparar!");
	        return;
	    }

	    boolean iguais = true;

	    for (int i = 0; i <= topo; i++) {
	        if (elementos[i] != outraPilha.elementos[i]) {
	            iguais = false;
	            break; 
	        }
	    }

	    if (iguais) {
	        System.out.println("Pilhas com VALORES IGUAIS!");
	    } else {
	        System.out.println("Pilhas com VALORES DIFERENTES!");
	    }
	}
	
	void inserirFibonacci(){
		int numeroAnterior = 0;
		int numeroAtual = 1;
		int numeroProximo;
		
	 for (int i = 0; i < elementos.length; i++) {
		 topo++;
		 elementos[topo] = numeroAnterior;
		 numeroProximo = numeroAnterior + numeroAtual;
		 numeroAnterior = numeroAtual;
		 numeroAtual = numeroProximo;
	 }
	}
	
	void contarNumeroPar() {
		int quantidade = 0;
		
		System.out.println("--- VALORES PARES NA PILHA ---");
		for(int i = 0; i <= topo; i++) {
			if(elementos[i] % 2 == 0) {
				System.out.println(elementos[i]);
				quantidade++;
			}
		}
		 System.out.println("QUANTIDADE DE N PARES NA PILHA É: " + quantidade);
	}
	
	Pilha numerosNaoUtilizados(Pilha outraPilha, int tamanho3) {
	    Pilha resultado = new Pilha(tamanho3);

	    for (int numero = 1; numero <= 100; numero++) {
	        if (resultado.topo + 1 == tamanho3) break;

	        boolean usadoNaPilha1 = false;
	        boolean usadoNaPilha2 = false;

	        for (int i = 0; i <= topo; i++) {
	            if (elementos[i] == numero) {
	                usadoNaPilha1 = true;
	                break;
	            }
	        }

	        for (int i = 0; i <= outraPilha.topo; i++) {
	            if (outraPilha.elementos[i] == numero) {
	                usadoNaPilha2 = true;
	                break;
	            }
	        }

	        if (!usadoNaPilha1 && !usadoNaPilha2) {
	            resultado.inserir(numero);
	        }
	    }

	    return resultado;
	}
	

	 
	}
	
