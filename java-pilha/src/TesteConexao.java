public class TesteConexao {
    public static void main(String[] args) {

        try (Conexao conexao = new Conexao()) {
            conexao.leDados();
        } catch (IllegalStateException err) {
            System.out.println("Erro na conexao!");
        }

// ---------------------------------------
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch (IllegalStateException err) {
//            System.out.println("Erro na conexao!");
//        } finally {
//            if (con != null) {
//                con.close();
//            }
//        }
    }
}
