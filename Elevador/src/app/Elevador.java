package app;

public class Elevador {

	int andarAtual=0, totalAndares, capElev, qtdPessoas;
	
	public Elevador(){
		
	}

	public Elevador(int andarAtual, int totalAndares, int capElev, int qtdPessoas) {
		this.andarAtual = andarAtual;
		this.totalAndares = totalAndares;
		this.capElev = capElev;
		this.qtdPessoas = qtdPessoas;
	}

	public int getAndarAtual() {
		return andarAtual;
	}

	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}

	public int getTotalAndares() {
		return totalAndares;
	}

	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
	}

	public int getCapElev() {
		return capElev;
	}

	public void setCapElev(int capElev) {
		this.capElev = capElev;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
	public void entra() {
		this.qtdPessoas+=1;
	}
	public void sai() {
		this.qtdPessoas-=1;
	}
	public void sobe() {
		this.andarAtual+=1;
	}
	public void desce() {
		this.andarAtual-=1;
	}
	
	
}
