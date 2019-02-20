package utilsbanco;

public class Conta {

	private int numero_da_conta;
	private String nome;
	private double quantidade;

	public Conta(int numero_da_conta, String nome, double quantidade) {
		this.numero_da_conta = numero_da_conta;
		this.nome = nome;
		deposito(quantidade);
	}

	public Conta(int numero_da_conta, String nome) {
		this.numero_da_conta = numero_da_conta;
		this.nome = nome;
	}

	public int getNumero_da_conta() {
		return numero_da_conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void deposito(double quantidade) {

		this.quantidade += quantidade;

	}

	public void saques(double quantidade) {
		this.quantidade -= (5.00 + quantidade);
	}

	public String toString() {

		return "Conta " + numero_da_conta + ", Nome da Conta: " + nome + " Saldo: R$ "
				+ String.format("%.2f", quantidade);

	}

}
