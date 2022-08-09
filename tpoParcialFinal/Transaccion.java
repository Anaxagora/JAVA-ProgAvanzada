package tpoParcialFinal;

public abstract class Transaccion {

	protected static int transaccionId=0;
	

	public int getTransaccionId() {
		return transaccionId;
	}

	public abstract void sumarId();

	public abstract void ejecutarTransaccion();
}
