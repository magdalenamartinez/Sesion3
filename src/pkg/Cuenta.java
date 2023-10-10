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
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	public void setSaldo(double saldo) {
		this.saldo =  saldo; 
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void ingresar(int i) {
		this.setSaldo(this.getSaldo() + i);
	}

	
	public void retirar(int i) {
		double res = this.saldo - i;
		if (res >= 0) {
			this.saldo = this.saldo - i;
		}
	}
	
}
