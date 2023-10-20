package controller;

import model.Empresa;
import model.Funcionario;

import java.time.LocalDate;
import java.util.Comparator;

public class EmpresaFuncionarioController {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(100L, "12345678910", "Carlos", "Silva", LocalDate.of(1998, 2, 10));
        Funcionario f2 = new Funcionario(100L, "12345678920", "Marcia", "Costa", LocalDate.of(1999, 4, 21));
        Funcionario f3 = new Funcionario(100L, "12345678930", "Julia", "Lima", LocalDate.of(1994, 5, 16));
        Funcionario f4 = new Funcionario(100L, "12345678940", "Carol", "Andrade", LocalDate.of(1988, 2, 13));
        Funcionario f5 = new Funcionario(100L, "12345678950", "Maitê", "Monteiro", LocalDate.of(1989, 1, 7));
        Funcionario f6 = new Funcionario(100L, "12345678960", "Jean", "Silveira", LocalDate.of(2001, 11, 27));

        Empresa e1 = new Empresa("12.343.600/0001-58", "Cosméticos LTDA", "CosméticosAbril");
        Empresa e2 = new Empresa("93.453.875/0001-42", "Construção SA", "ConstruçãoHorizonte");

        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);

        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        System.out.print("\nFuncionários da empresa por critério de nome:\n");
        System.out.print("\n" + e1.getNomeFantasia());
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);
        System.out.print("\n" + e2.getNomeFantasia());
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e2);

        System.out.print("\nFuncionários da empresa por critério de idade na ordem decrescente:\n");
        System.out.print("\n" + e1.getNomeFantasia());
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e1);
        System.out.print("\n" + e2.getNomeFantasia());
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getDataNascimento).reversed());
        System.out.println(e2);

    }
}
