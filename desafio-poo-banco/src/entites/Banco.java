package entites;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Banco {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public void addConta(Conta conta){
        if(!contas.contains(conta)){
            contas.add(conta);
        } else {
            System.out.println("Conta já cadastrada");
        }
    }

    public void imprimirClientes(){
        Set<Cliente> clientes = new HashSet<>();
        System.out.println("Lista de clientes: ");
        if(!contas.isEmpty()){
            for(Conta conta : contas){
                clientes.add(new Cliente(conta.getCliente().getNome()));
            }
        }
        for(Cliente cliente : clientes){
            System.out.println(cliente.getNome());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
