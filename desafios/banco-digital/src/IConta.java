public interface IConta {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, IConta contaDestino);

    void imprimirExtrato();

    String agencia();

    String numero();

    String saldo();

    void imprimirInfosComuns();
}
