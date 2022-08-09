package tpoParcialFinal;
import java.util.ArrayList;
import java.util.Scanner;
public class ATM{

	private static final ATM instance = new ATM();
	private ArrayList<Cuenta> cuentas;
	private int efectivo;
	private Cuenta cTrans;
	private Transaccion ope1 = new ConsultaSaldo();
	private Transaccion ope2 = new Retira();
	private Transaccion ope3 = new Deposita();
	
	private ATM() {
		this.efectivo = 10000;
		cuentas = new ArrayList<>();
	}
	public static ATM getInstance() {
		return instance;
	}
	public Cuenta agregarCuenta(Cuenta cuenta) {
		cuentas.add(cuenta);
		return cuenta;
	}
	/*public void misClientes() {
		for (Cuenta cuenta : cuentas) {
			System.out.println(cuenta.toString());
		}
	}*/
	public int getEfectivo() {
		return efectivo;
	}
	public Cuenta getcTrans() {
		return cTrans;
	}
	public void setEfectivo(int efectivo) {
		this.efectivo = efectivo;
	}
	/*public void retirarDinero() {
		//ope2.ejecutarTransaccion();
	}*/
	/*public void depositarDinero() {
		//ope3.ejecutarTransaccion();
	}*/
	public Cuenta iniciarSesion() {
		int check = 0;
		do {
			Scanner ent = new Scanner(System.in);
			System.out.println("Bienvenido al Banco");
			System.out.println("Ingrese Cuenta: ");
			int cuenta = ent.nextInt();
			System.out.println("Ingrese NIP: ");
			int nip = ent.nextInt();
			for (Cuenta ca : cuentas) {
				if (ca.getCuenta()==cuenta && ca.getNip()==nip) {
					check = 1;
					cTrans = (Cuenta) ca;
					break;
				}
			}
			if (check==1) {
				System.out.println("Se ha iniciado sesion correctamente");
			} else {
				System.out.println("ha ocurrido un problema, vuelva a intentarlo");
			}
		}while (check==0);
		return cTrans;
}
	public void menu() {
		System.out.println("Que operación desea realizar:\n1)Consultar saldo.\n2)Retirar efectivo.\n3)Depositar efectivo.\n4)Salir");
		Scanner ent = new Scanner(System.in);
		int opc = ent.nextInt();
		do {
			switch (opc) {
			case 1:
				ope1.ejecutarTransaccion();
				break;
			case 2: 
				ope2.ejecutarTransaccion();
				break;
			case 3:
				ope3.ejecutarTransaccion();
				break;
			case 4:
					//opc = 4;
				break;
			default:
				System.out.println("Opcion incorrecta.");
				break;
			}
			System.out.println("¿Desea hacer algo mas?");
			opc = ent.nextInt();
		} while (opc != 4);
		System.out.println("Adios");
	}
}
