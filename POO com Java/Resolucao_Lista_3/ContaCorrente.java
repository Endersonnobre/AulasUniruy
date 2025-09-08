
public class ContaCorrente {
	protected int Saldo;
	
	public void depositar(int quantia) {
		Saldo += quantia;
	}
	
	public void saque(int quantia){
		Saldo -= quantia *  1.05;
	}
	
	public int getSaldo() {
		return Saldo;
	}
}
