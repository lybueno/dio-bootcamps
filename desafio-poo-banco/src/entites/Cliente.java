package entites;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {

    private String nome;
    private List<Conta> contas = new ArrayList<>();

    public Cliente(){

    }

    public Cliente(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addContaCliente(Conta conta){
        if(!contas.contains(conta)){
            contas.add(conta);
        } else {
            System.out.println("Conta já cadastrada");
        }
    }

    public void imprimirTotal(){
        double total = 0.0d;
        if(!contas.isEmpty()){
            for(Conta conta : contas){
                total += conta.getSaldo();
            }
            System.out.println(String.format("Total investido: R$%.2f", total));
        }
        else {
            System.out.println("Cliente não possui conta.");
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(nome, cliente.nome) && Objects.equals(contas, cliente.contas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, contas);
    }
}
