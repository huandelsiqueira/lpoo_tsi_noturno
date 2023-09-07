package controller;

import model.*;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioController {
    public static void main(String[] args) {

        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("José Amaral", 5000.00);

        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor("Melissa Duarte", 8500.00);

        System.out.println("\nLista de gerentes e desenvolvedores:\n");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(d1);
        System.out.println(d2);

        g1.setNome("Carmem Gonçalves");
        g1.setSalario(12000.00);

        d1.setNome("Adilson Ferreira");
        d1.setSalario(4500.00);

        System.out.println("\nLista de gerentes e desenvolvedores após alteração:\n");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println("\nLista de gerentes e desenvolvedores com seus bônus:\n");
        System.out.println(g1 + " bônus= " + g1.getBonus());
        System.out.println(g2 + " bônus= " + g2.getBonus());
        System.out.println(d1 + " bônus= " + d1.getBonus());
        System.out.println(d2 + " bônus= " + d2.getBonus());

        /* 1. Foi possível criar instâncias da classe Funcionario? Justifique sua resposta.
        Resposta: Não, pois Funcionario é uma classe abstrata.

        2. Onde você deve inserir estas regras de negócio? Na classe xxController ou nas classes Gerente e Desenvolvedor? Justifique sua resposta.
        Resposta: Nas classes Gerente e Desenvolvedor, pois as regras de negócio são postas no padrão model em cada classse. */

        Gerente ger1 = new GerenteGeral("Rafael Pereira", 6500.00);
        Gerente ger2 = new GerenteDesenvolvimento("Ana Teixeira", 4500.00);

        Desenvolvedor dev1 = new DesenvolvedorSenior("Maria Barbosa", 3500.00);
        Desenvolvedor dev2 = new DesenvolvedorSenior("Julia Monterrey", 3500.00);
        Desenvolvedor dev3 = new DesenvolvedorSenior("Ítalo Souza", 3500.00);
        Desenvolvedor dev4 = new DesenvolvedorSenior("Juan Silva", 3500.00);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Rafaella Silveira", 3500.00);
        Desenvolvedor dev6 = new DesenvolvedorSenior("Marcos Costa", 3500.00);

        Desenvolvedor dev7 = new DesenvolvedorPleno("Marta Lourenço", 2500.00);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Guilherme Lourdes", 2500.00);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Huandel Siqueira", 2500.00);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Eduardo Conceição", 2500.00);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Juliana Castro", 2500.00);
        Desenvolvedor dev12 = new DesenvolvedorPleno("Miguel Alvarenga", 2500.00);

        Desenvolvedor dev13 = new DesenvolvedorJunior("Kátia Soares", 1800.00);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Alex Gonçalves", 1800.00);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Pablo Maia", 1800.00);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Luís Amaral", 1800.00);
        Desenvolvedor dev17 = new DesenvolvedorJunior("Carlos Duarte", 1800.00);
        Desenvolvedor dev18 = new DesenvolvedorJunior("Matheus Peireira", 1800.00);

        List<Funcionario> FuncionarioList = new ArrayList<>();
        FuncionarioList.add(ger1);
        FuncionarioList.add(ger2);
        FuncionarioList.add(dev1);
        FuncionarioList.add(dev2);
        FuncionarioList.add(dev3);
        FuncionarioList.add(dev4);
        FuncionarioList.add(dev5);
        FuncionarioList.add(dev6);
        FuncionarioList.add(dev7);
        FuncionarioList.add(dev8);
        FuncionarioList.add(dev9);
        FuncionarioList.add(dev10);
        FuncionarioList.add(dev11);
        FuncionarioList.add(dev12);
        FuncionarioList.add(dev13);
        FuncionarioList.add(dev14);
        FuncionarioList.add(dev15);
        FuncionarioList.add(dev16);
        FuncionarioList.add(dev17);
        FuncionarioList.add(dev18);

        System.out.println(FuncionarioList);

        double somaSalario = 0;
        for(Funcionario func: FuncionarioList) {
            somaSalario += func.getSalario();
        }
        System.out.println("\nFolha salarial sem bônus = " + NumberFormat.getCurrencyInstance().format(somaSalario));

        somaSalario = 0;
        for (Funcionario func: FuncionarioList) {
            somaSalario += func.getSalario() + func.getBonus();
        }
        System.out.println("Folha salarial com bônus = " + NumberFormat.getCurrencyInstance().format(somaSalario) + "\n");

        System.out.println("Folha salarial bruta de cada funcionário:\n");
        for (Funcionario func: FuncionarioList) {
            System.out.print(func.getClass().getSimpleName());
            System.out.println("{nome= " + func.getNome() + "; bônus= " + NumberFormat.getCurrencyInstance().format(func.getBonus()) + "; salário bruto= " + NumberFormat.getCurrencyInstance().format((func.getSalario() + func.getBonus())) + "};");
        }


        double somaReajuste = 0;
        for (Funcionario func: FuncionarioList) {
            somaReajuste += func.getSalario() + func.getSalario() * 0.05;
        }
        System.out.println("\nFolha salarial com reajuste de 5% = " + NumberFormat.getCurrencyInstance().format(somaReajuste) + "\n");

    }

}
