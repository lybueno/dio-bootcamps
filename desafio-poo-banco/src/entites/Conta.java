package entites;

public abstract class Conta implements IConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 0;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        agencia = Conta.AGENCIA_PADRAO;
        numero = ++SEQUENCIAL;
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

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns(){
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d",  numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
        System.out.println("=======================");
    }

    @Override
    public boolean sacar(double valor) {
        if(saldo >= valor){
            saldo -= valor;
            return true;
        } else {
            System.out.println("Não há saldo disponível");
            return false;
        }
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
        if(this.sacar(valor)) contaDestino.depositar(valor);
    }
}
