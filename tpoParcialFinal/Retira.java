package tpoParcialFinal;

import java.util.Scanner;

public class Retira extends Transaccion{


	@Override
	public void ejecutarTransaccion() {
		sumarId();
		System.out.println("Transaccion Nro: "+ getTransaccionId());
		Scanner ent = new Scanner(System.in);
		System.out.println("¿Cuanto desea retirar?");
		int monto = ent.nextInt();
		if (monto<=ATM.getInstance().getEfectivo()) {
			if (monto <= ATM.getInstance().getcTrans().getSaldo()) {
				ATM.getInstance().getcTrans().retirarSaldo(monto);
				System.out.println("*Brrr, ziip*: Retire su dinero!");
			} else {
				System.out.println("No tiene saldo saldo suficiente");
			}
			ATM.getInstance().setEfectivo(ATM.getInstance().getEfectivo()-monto);
		} else {
			System.out.println("El cajero no dispone de esa cantidad de efectivo para ser retirada.");
		}
	}
	@Override
	public void sumarId() {
		transaccionId++;// TODO Auto-generated method stub
	}
}
