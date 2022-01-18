import entites.*;

public class Main {

    public static void main(String[] args) {

        Banco bco = new Banco();
        bco.setNome("Banco GC&CS");

        Cliente cliente = new Cliente();
        cliente.setNome("Alan Turing");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cliente.addContaCliente(cc);
        cliente.addContaCliente(poupanca);

        bco.addConta(cc);
        bco.addConta(poupanca);

        Cliente cl = new Cliente("Ada Lovelace");
        Conta cc2 = new ContaCorrente(cl);
        cl.addContaCliente(cc2);
        bco.addConta(cc2);
        cc2.depositar(230.90);

        cc.depositar(200.50);
        cc.transferir(poupanca,300.0);
        cc.transferir(poupanca, 100.0);
        cc2.transferir(cc, 80.0);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc2.imprimirExtrato();

        System.out.println("-=-=-=-=-");
        cliente.imprimirTotal();
        System.out.println("-=-=-=-=-=-");
        bco.imprimirClientes();
    }
}
