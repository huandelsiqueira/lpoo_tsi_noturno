package model;

public class Gerente extends Funcionario {

    public Gerente() {
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * 0.2;
    }

    @Override
    public String toString() {
        return "Gerente{nome= " + super.getNome() + "; salário= " + super.getSalario() + "}";
    }
}
