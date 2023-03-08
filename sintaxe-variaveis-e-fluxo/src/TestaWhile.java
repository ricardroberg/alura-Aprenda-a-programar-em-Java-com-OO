public class TestaWhile {
    public static void main(String[] args) {

        int contador = 0;

        while(contador <= 10){
            System.out.println(contador);
//            contador = contador + 1;
//            contador += 1;
//            ++contador;
            contador++; // Ao somar 10 + 1 ele sai do laço e o valor de CONTADOR é 11
        }
        System.out.println(contador); // 11
    }
}
