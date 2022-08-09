package tpoParcialFinal;

public class ConsultaSaldo extends Transaccion{


	@Override
	public void ejecutarTransaccion() {
		sumarId();
		System.out.println("Transaccion Nro: "+ getTransaccionId());
		System.out.println("Su saldo es: "+ ATM.getInstance().getcTrans().getSaldo());

	}

	@Override
	public void sumarId() {
		transaccionId++;// TODO Auto-generated method stub
	}

}
