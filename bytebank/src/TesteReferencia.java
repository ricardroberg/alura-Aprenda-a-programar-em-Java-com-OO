import java.util.Locale;

public class TesteReferencia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " + primeiraConta.saldo); //300
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " + segundaConta.saldo); //300
		
		segundaConta.saldo += 100;
		System.out.println("Adicionado 100 na segunda conta.");
		System.out.println("Saldo da primeira: " + primeiraConta.saldo); //300
		System.out.println("Saldo da segunda: " + segundaConta.saldo); //300
		
		if(primeiraConta == segundaConta) {
			System.out.println("São contas iguais(Possuem a mesma referência)");
		} else {
			System.out.println("São contas diferentes.");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}

}
