
public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100.00;
		System.out.println("Saldo conta: " + contaDoPaulo.saldo);

		contaDoPaulo.deposita(50.00);
		System.out.println("Saldo conta após deposito: " + contaDoPaulo.saldo);

		contaDoPaulo.saca(20);
		boolean conseguiuSacar = contaDoPaulo.saca(20);
		System.out.println("Saldo conta após saque: " + contaDoPaulo.saldo);
		System.out.println(conseguiuSacar);

		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);

		boolean sucessoTransferencia = contaDaMarcela.transfere(500.0, contaDoPaulo);
		
		if (sucessoTransferencia) {
			System.out.println("Transferência feita com sucesso!");
		} else {
			System.out.println("Não há saldo suficiente para essa transferência!");
		}
		System.out.println("Saldo Marcela: " + contaDaMarcela.saldo);
		System.out.println("Saldo Paulo: " + contaDoPaulo.saldo);

		contaDoPaulo.titular = "Paulo Silveira";
		System.out.println("Titular conta Paulo: " + contaDoPaulo.titular);
	}



}
