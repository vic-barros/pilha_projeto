package pilha_projeto;
import java.util.Scanner;

public class Main {
	
	 public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o tamanho da pilha 1: ");
		int tamanho1 = scanner.nextInt();

		System.out.print("Digite o tamanho da pilha 2: ");
		int tamanho2 = scanner.nextInt();

		System.out.print("Digite o tamanho da pilha 3: ");
		int tamanho3 = scanner.nextInt();

		Pilha pilha1 = new Pilha(tamanho1);
		Pilha pilha2 = new Pilha(tamanho2);

		for (int i = 0; i < tamanho1; i++) pilha1.inserirAleatorio(100);
		for (int i = 0; i < tamanho2; i++) pilha2.inserirAleatorio(100);

		System.out.println("---------- PILHA 1 ----------");
		pilha1.exibir();
		System.out.println("---------- PILHA 2 ----------");
		pilha2.exibir();

		Pilha pilha3 = pilha1.numerosNaoUtilizados(pilha2, tamanho3);

		System.out.println("---------- PILHA 3 (não utilizados) ----------");
		pilha3.exibir();


		scanner.close();
	 }
}
