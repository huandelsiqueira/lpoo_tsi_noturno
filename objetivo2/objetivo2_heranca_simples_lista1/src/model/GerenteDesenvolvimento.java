package model;

public class GerenteDesenvolvimento extends Gerente {

    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double getBonus() {
        return this.getSalario() * ((double) 20 /100);
    }

    @Override
    public String toString() {
        return "\nGerenteDesenvolvimento{nome= " + super.getNome() + ";salário= " + super.getSalario() + "}";
    }
}
