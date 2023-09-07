package controller;

import model.Conta;

import java.util.*;

public class ContaController {
    public static void main(String[] args) {

        Conta conta1 = new Conta();
        Conta conta2 = new Conta();
        Conta conta3 = new Conta(2, 14576.89);
        Conta conta4 = new Conta(3, 1999.99);
        Conta conta5 = new Conta(1, 756.00);

        System.out.println(conta1);
        System.out.println(conta2);
        System.out.println(conta3);
        System.out.println(conta4);
        System.out.println(conta5);

        conta1.setId(4);
        conta1.setSaldo(25.99);

        conta2.setId(5);
        conta2.setSaldo(44.63);

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());

        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        System.out.println(conta3.getId());
        System.out.println(conta3.getSaldo());

        System.out.println(conta4.getId());
        System.out.println(conta4.getSaldo());

        System.out.println(conta5.getId());
        System.out.println(conta5.getSaldo());

        //Coleção "List"
        List<Conta> ContaList = new ArrayList<>();
        ContaList.add(conta1);
        ContaList.add(conta2);
        ContaList.add(conta3);
        ContaList.add(conta4);
        ContaList.add(conta5);
        System.out.print("\nPrint da lista 'ContaList':\n");
        System.out.println(ContaList);

        Conta contaProcurada = ContaList.stream().filter(contaid3 -> contaid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(contaProcurada);

        System.out.print("\nOrdenando a lista por 'id':\n");
        ContaList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println(ContaList);

        //Coleção "Map"
        Map<Integer, Conta> ContaListMap = new HashMap<>();
        ContaListMap.put(conta1.getId(), conta1);
        ContaListMap.put(conta2.getId(), conta2);
        ContaListMap.put(conta3.getId(), conta3);
        ContaListMap.put(conta4.getId(), conta4);
        ContaListMap.put(conta5.getId(), conta5);
        System.out.print("\nPrint da coleção Map 'ContaListMap':\n");
        System.out.println(ContaListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(ContaListMap.get(3));

    }
}
