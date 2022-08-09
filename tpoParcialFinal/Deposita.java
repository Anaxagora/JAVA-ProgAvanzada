package tpoParcialFinal;

import java.util.Scanner;

public class Deposita extends Transaccion{


	@Override
	public void ejecutarTransaccion() {
		sumarId();
		System.out.println("Transaccion Nro: "+ getTransaccionId());
		Scanner ent = new Scanner(System.in);
		System.out.println("¿Cuanto desea depositar?");
		int monto = ent.nextInt();
		ATM.getInstance().setEfectivo(ATM.getInstance().getEfectivo()+monto);
		ATM.getInstance().getcTrans().setSaldo(ATM.getInstance().getcTrans().getSaldo()+monto);
		System.out.println("*Brrr, ziip*: Dinero depositado!");

	}
	@Override
	public void sumarId() {
		transaccionId++;// TODO Auto-generated method stub
	}
}
