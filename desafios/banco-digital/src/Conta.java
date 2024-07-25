public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public int agencia;
    public int numero;
    public double saldo;
    public Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(double valor, IConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s" + this.cliente.getNome()));
        System.out.println(String.format("Agencia: %s" + this.agencia()));
        System.out.println(String.format("Numero: %s" + this.numero()));
        System.out.println(String.format("Saldo: %s" + this.saldo()));
    }
}
