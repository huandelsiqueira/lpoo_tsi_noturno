package controller;

import model.*;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Huandel", "Siqueira", "KMY10", 2000);
        Cliente cliente2 = new Cliente("Carmem", "Siqueira", "KMY10", 1000);
        Cliente cliente3 = new Cliente("Adilson", "Soares", "KMY10", 5000);
        Cliente cliente4 = new Cliente("Helen", "Siqueira", "KMY10", 700);
        Cliente cliente5 = new Cliente("Ricardnei", "Siqueira", "KMY10", 450);
        Cliente cliente6 = new Cliente("Ritta", "Rodrigues", "KMY10", 975);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);
        System.out.println(cliente6);

        Desenvolvedor dev1 = new Desenvolvedor("Carlos", 3400.00);
        Desenvolvedor dev2 = new Desenvolvedor("Airton", 2000.00);
        Desenvolvedor dev3 = new Desenvolvedor("Vitor", 1600.00);
        Desenvolvedor dev4 = new Desenvolvedor("Maria", 5340.00);
        Desenvolvedor dev5 = new Desenvolvedor("Vitoria", 7500.00);
        Desenvolvedor dev6 = new Desenvolvedor("Cássia", 6500.00);

        System.out.println(dev1);
        System.out.println(dev2);
        System.out.println(dev3);
        System.out.println(dev4);
        System.out.println(dev5);
        System.out.println(dev6);

        Gerente ger1 = new Gerente("Rafael", 17000.00, "JLD940", 8000);
        Gerente ger2 = new Gerente("Maria", 14500.00, "JLD940", 500);
        Gerente ger3 = new Gerente("Beatriz", 17800.00, "JLD940", 1500);
        Gerente ger4 = new Gerente("Matheus", 9000.00, "JLD940", 5000);
        Gerente ger5 = new Gerente("Joice", 29000.00, "JLD940", 9000);
        Gerente ger6 = new Gerente("Ricardo", 25250.00, "JLD940", 10150);

        System.out.println(ger1);
        System.out.println(ger2);
        System.out.println(ger3);
        System.out.println(ger4);
        System.out.println(ger5);
        System.out.println(ger6);

        List<Funcionario> FuncionarioList = new ArrayList<>();
        FuncionarioList.add(dev1);
        FuncionarioList.add(dev2);
        FuncionarioList.add(dev3);
        FuncionarioList.add(dev4);
        FuncionarioList.add(dev5);
        FuncionarioList.add(dev6);
        FuncionarioList.add(ger1);
        FuncionarioList.add(ger2);
        FuncionarioList.add(ger3);
        FuncionarioList.add(ger4);
        FuncionarioList.add(ger5);
        FuncionarioList.add(ger6);

        List<Investidor> InvestidorList = new ArrayList<>();
        InvestidorList.add(cliente1);
        InvestidorList.add(cliente2);
        InvestidorList.add(cliente3);
        InvestidorList.add(cliente4);
        InvestidorList.add(cliente5);
        InvestidorList.add(cliente6);
        InvestidorList.add(ger1);
        InvestidorList.add(ger2);
        InvestidorList.add(ger3);
        InvestidorList.add(ger4);
        InvestidorList.add(ger5);
        InvestidorList.add(ger6);

        System.out.println("\n\nLista de Funcionarios:\n");
        System.out.print(FuncionarioList);

        System.out.println("\n\nLista de Investidores:\n");
        System.out.print(InvestidorList);

        FuncionarioList.sort(Comparator.comparing(Funcionario::getSalario).reversed());
        System.out.println("\n\nLista dos funcionários ordenada pelo salário em ordem decrescente:\n");
        System.out.print(FuncionarioList);

        InvestidorList.sort(Comparator.comparing(Investidor::getQuantidade).reversed());
        System.out.println("\n\nLista dos clientes ordenada pela quantidade de tickers em ordem decrescente:\n");
        for (Investidor cliente: InvestidorList) {
            if (cliente instanceof Cliente) {
                System.out.print(cliente);
            }
        }

        System.out.println("\n\nLista de investidores ordenada pela quantidade de tickers em ordem decrescente:\n");
        System.out.print(InvestidorList);

        Funcionario func_maior_salario = Collections.max(FuncionarioList, Comparator.comparing(Funcionario::getSalario));
        System.out.println("\n\nFuncionário com o maior salário:");
        for (Funcionario func: FuncionarioList) {
            if (func.getSalario() >= func_maior_salario.getSalario()) {
                System.out.println(func);
            }
        }

        Investidor invest_maior_qt = Collections.max(InvestidorList, Comparator.comparing(Investidor::getQuantidade));
        System.out.println("\nInvestidor com a maior quantidade de tickers:");
        for (Investidor invest: InvestidorList) {
            if(invest.getQuantidade() >= invest_maior_qt.getQuantidade()) {
                System.out.println(invest);
            }
        }
    }
}
