package controller;

import model.Funcionario;

import java.util.*;

public class FuncionarioController {
    public static void main(String[] args) {

        Funcionario funcionario1 = new Funcionario();
        Funcionario funcionario2 = new Funcionario();
        Funcionario funcionario3 = new Funcionario(3, "Huandel", 1320.10);
        Funcionario funcionario4 = new Funcionario(4, "José Carlos", 2300.57);
        Funcionario funcionario5 = new Funcionario(5, "Carmem", 16875.33);

        System.out.println(funcionario1);
        System.out.println(funcionario2);
        System.out.println(funcionario3);
        System.out.println(funcionario4);
        System.out.println(funcionario5);

        funcionario1.setId(1);
        funcionario1.setNome("Adilson");
        funcionario1.setSalario(6545.48);

        funcionario2.setId(2);
        funcionario2.setNome("Helen");
        funcionario2.setSalario(43000.00);

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(funcionario1.getId());
        System.out.println(funcionario1.getNome());
        System.out.println(funcionario1.getSalario());

        System.out.println(funcionario2.getId());
        System.out.println(funcionario2.getNome());
        System.out.println(funcionario2.getSalario());

        System.out.println(funcionario3.getId());
        System.out.println(funcionario3.getNome());
        System.out.println(funcionario3.getSalario());

        System.out.println(funcionario4.getId());
        System.out.println(funcionario4.getNome());
        System.out.println(funcionario4.getSalario());

        System.out.println(funcionario5.getId());
        System.out.println(funcionario5.getNome());
        System.out.println(funcionario5.getSalario());

        //Coleção List
        List<Funcionario> FuncionarioList = new ArrayList<>();
        FuncionarioList.add(funcionario1);
        FuncionarioList.add(funcionario2);
        FuncionarioList.add(funcionario3);
        FuncionarioList.add(funcionario4);
        FuncionarioList.add(funcionario5);
        System.out.print("\nPrint da lista 'FuncionarioList':\n");
        System.out.println(FuncionarioList);

        Funcionario funcionarioProcurado = FuncionarioList.stream().filter(funcionarioid3 -> funcionarioid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(funcionarioProcurado);

        System.out.print("\nOrdenando a lista por 'id':\n");
        FuncionarioList.sort(Comparator.comparing(Funcionario::getId).reversed());
        System.out.println(FuncionarioList);

        //Coleção Map
        Map<Integer, Funcionario> FuncionarioListMap = new HashMap<>();
        FuncionarioListMap.put(funcionario1.getId(), funcionario1);
        FuncionarioListMap.put(funcionario2.getId(), funcionario2);
        FuncionarioListMap.put(funcionario3.getId(), funcionario3);
        FuncionarioListMap.put(funcionario4.getId(), funcionario4);
        FuncionarioListMap.put(funcionario5.getId(), funcionario5);
        System.out.print("\nPrint da coleção Map 'CarroListMap':\n");
        System.out.println(FuncionarioListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(FuncionarioListMap.get(3));

    }
}
