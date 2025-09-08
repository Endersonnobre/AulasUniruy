
public class ClienteEspecial extends ContaCorrente {
	@Override
	public void saque(int quantia) {
		Saldo -= quantia * 1.01;
	}
	
}
