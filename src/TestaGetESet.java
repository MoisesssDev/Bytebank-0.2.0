public class TestaGetESet {
    public static void main(String[] args) {
//      Cria um cliente, adicionando seus respectivos atributos.
        Cliente cliente = new Cliente("Moises Almeida", "222.222.222-22", "Programador");


//      Cria uma conta, adicionando valor aos atributos Numero, Agencia e Titular da conta.
        Conta conta = new Conta(cliente, 15, 1377 );// (Titular: value, Agencia: value, Numero: value)

        conta.deposita(250); // Realiza um deposito no saldo da conta.
        conta.mostrarDadosDaConta();

        System.out.println("Total de contas criadas no ByteBank: " + Conta.getTotalDeContas());
    }
}
