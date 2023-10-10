package pkg;

public class Cuenta {
	String numero;
	String titular;
	double saldo;
	
	public Cuenta(String numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void ingresar(int i) {
		saldo += i;
	}

	public void setSaldo(double saldo) {
		this.saldo =  saldo; 
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void retirar(int i) {
		double res = this.saldo - i;
		if (res >= 0) {
			this.saldo = this.saldo - i;
		}
	}
	
}
