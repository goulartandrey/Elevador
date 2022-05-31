package app;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Elevador e1 = new Elevador();
		int op, capacidade, andares;
		
		System.out.println("INICIALIZANDO O ELEVADOR");
		System.out.println("Digite a capacidade do elevador: ");
		capacidade = sc.nextInt();
		System.out.println("Total de andares do prédio:");
		andares = sc.nextInt();
		Elevador e1 = new Elevador(0, andares, capacidade,0);
		do {
			System.out.println("Digite a opção desejada:\n1-Entrar pessoa:\n2-Sair pessoa:\n3-Subir andar:\n4-Descer andar:\n"
					+"0-Sair:");
			op=sc.nextInt();
			switch(op) {
			case 1:
				if(e1.getQtdPessoas()<e1.getCapElev()) {
					System.out.println("Entrou uma pessoa!");
					e1.entra();
				}else {
					System.out.println("Elevador cheio!");
				}
				System.out.println("Total de pessoas: " + e1.getQtdPessoas());
			break;
			case 2:
				if(e1.getQtdPessoas()==0) {
					System.out.println("Elevador vazio!");
				}else {
					System.out.println("Saiu uma pessoa!");
					e1.sai();
					System.out.println("Total de pessoas: " + e1.getQtdPessoas());
				}
			break;
			case 3:
				if(e1.getAndarAtual()<e1.getTotalAndares()) {
					System.out.println("Subir andar!");
					e1.sobe();
					System.out.println("Andar atual: " + e1.getAndarAtual());
				}else {
					System.out.println("Andar maximo atingido!");
				}
			break;
			case 4:
				if(e1.getAndarAtual()==0) {
					System.out.println("impossivel descer!");
				}else {
					e1.desce();
				}
			break;
			case 0:
				System.out.println("Encerrando.");
			break;
			default:
				System.out.println("Opção inválida.");
			break;
			}		
		}while(op!=0);
	}
}
