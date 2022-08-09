package tpoParcialFinal;

public class Cuenta {

	private Cliente cliente;
	private int cuenta;
	private int nip;
	private int saldo;
	
	public Cuenta(Cliente cliente, int cuenta, int nip, int saldo) {
		setCliente(cliente);
		setCuenta(cuenta);
		setNip(nip);
		setSaldo(saldo);
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public int getCuenta() {
		return cuenta;
	}
	public void setCuenta(int cuenta) {
		if (cuenta<=99999) {
			this.cuenta = cuenta;
		} else {
			throw new IllegalArgumentException("La cuenta debe contener, como maximo, 5 digitos");
		}
	}
	public int getNip() {
		return nip;
	}
	public void setNip(int nip) {
		if (nip<=99999) {
			this.nip = nip;
		} else {
			throw new IllegalArgumentException("El NIP debe contener, como maximo, 5 digitos");
		}
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int retirarSaldo(int monto) {
		saldo-=monto;
		return saldo;
	}
	@Override
	public String toString() {
		return cliente.toString() + "\nMIS DATOS BANCARIOS\nCuenta: " + 
				getCuenta() + "\nNIP: " + getNip() + "\nSaldo: " + getSaldo();
	}



	
	
}
