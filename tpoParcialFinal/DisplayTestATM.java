package tpoParcialFinal;
import java.util.Scanner;

public class DisplayTestATM {

	public static void main(String[] args) {

		ATM atm = ATM.getInstance();
		//Cliente c1 = new Cliente("Nicolas", "Barreiro", 39066032);
		//Cliente c2 = new Cliente("Martina", "Esparis", 39066032);
		//Cliente c3 = new Cliente("Arsen", "Kramarchuk", 39066032);
		//Cuenta ca1 = new Cuenta(new Cliente("Nicolas", "Barreiro", 39066032), 11111, 11111, 50001);
		//Cuenta ca2 = new Cuenta(new Cliente("Martina", "Esparis", 39066032), 22222, 22222, 50002);
		//Cuenta ca3 = new Cuenta(new Cliente("Arsen", "Kramarchuk", 39066032), 33333, 33333, 50003);
		atm.agregarCuenta(new Cuenta(new Cliente("Nicolas", "Barreiro", 39066032), 11111, 11111, 5001));
		atm.agregarCuenta(new Cuenta(new Cliente("Martina", "Esparis", 39626976), 22222, 22222, 5002));
		atm.agregarCuenta(new Cuenta(new Cliente("Arsen", "Kramarchuk", 93857179), 33333, 33333, 5003));
		
		//atm.misClientes();
		do {
			atm.iniciarSesion();
			atm.menu();
		} while (atm.getEfectivo()!=0);
		System.out.println("Este cajero no esta disponible para operar, vuelva mañana.");
	}

}
