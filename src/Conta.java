public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalDeContas;

    public Conta(Cliente titular, int agencia, int numero) {
        System.out.println("Criando conta...");

//        atribuindo ao titular
        this.titular = titular;

//        Validação Agencia.
        if (agencia <= 0) {
            System.out.println("Numero invalido");
            return;
        } else {
            this.agencia = agencia;
        }

//          Validação numero da conta.
        if (numero <= 0) {
            System.out.println("Numero invalido");
            return;
        } else {
            this.numero = numero;
        }

        this.saldo = 100; // Saldo ficticio, toda conta vai ser aberta com R$100.

        Conta.totalDeContas++; // A cada nova conta criada o nosso contador incrementa +1.

    }


    public void deposita(double valor) {
        this.saldo += valor;
        System.out.println("Deposito realizado, seu novo saldo"
                + " é de: " + this.saldo);
    }

    public String getSaldo() {
        //String seuSaldo = " Seu saldo é: "+ this.saldo;
        return "Seu saldo é: " + this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public int getAgencia() {
        return this.agencia;
    }


    public Cliente getTitular() {
        return titular;
    }

    public static int getTotalDeContas() {
        return totalDeContas;
    }

    public boolean sacar(double valor) {

        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque efetuado com sucesso, no valor de "
                    + valor + ".  Seu novo saldo é de: " + this.saldo);
            return true;
        } else {
            System.out.println("Voce nao possui Saldo para saque, seu"
                    + " saldo é de: " + this.saldo);

            return false;
        }

    }

    public void transfere(double valor, Conta destinoTransferencia) {

        if (this.saldo >= valor) {

            this.saldo -= valor;

            System.out.println("Transferencia realizada com sucesso, no valor de "
                    + valor + ".  Seu novo saldo é de: " + this.saldo);

            destinoTransferencia.deposita(valor);
        } else {
            System.out.println("Voce nao possui Saldo para saque, seu"
                    + " saldo é de: " + this.saldo);
        }
    }

    public void mostrarDadosDaConta(){
        System.out.println("Titular da Conta: " + getTitular().getNome());
        System.out.println("Numero da Conta: " + getNumero());
        System.out.println("Agencia: " + getAgencia());
    }


}
