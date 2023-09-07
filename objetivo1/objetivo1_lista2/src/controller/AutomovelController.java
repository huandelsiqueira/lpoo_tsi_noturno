package controller;

import model.Automovel;

import java.util.*;

public class AutomovelController {
    public static void main(String[] args) {

        Automovel automovel1 = new Automovel();
        Automovel automovel2 = new Automovel();
        Automovel automovel3 = new Automovel(3, "3333", "AAA-3333", "Verde", 4, "Gasolina", 5000, "3333333AAA", 14000.00);
        Automovel automovel4 = new Automovel(4, "4444", "BBB-4444", "Vermelho", 4, "Álcool", 21500, "4444444BBB", 5000.00);
        Automovel automovel5 = new Automovel(5, "5555", "CCC-5555", "Azul", 4, "Diesel", 154060, "5555555CCC", 2300.50);

        System.out.println(automovel1);
        System.out.println(automovel2);
        System.out.println(automovel3);
        System.out.println(automovel4);
        System.out.println(automovel5);

        automovel1.setId(1);
        automovel1.setRenavan("1111");
        automovel1.setPlaca("DDD-1111");
        automovel1.setCor("Branco");
        automovel1.setNum_rodas(6);
        automovel1.setCombustivel("Diesel");
        automovel1.setQuilometragem(40000);
        automovel1.setChassi("1111111DDD");
        automovel1.setValor_locacao(17500.00);

        automovel2.setId(2);
        automovel2.setRenavan("2222");
        automovel2.setPlaca("EEE-2222");
        automovel2.setCor("Preto");
        automovel2.setNum_rodas(4);
        automovel2.setCombustivel("Gasolina");
        automovel2.setQuilometragem(15750);
        automovel2.setChassi("2222222EEE");
        automovel2.setValor_locacao(9000.50);

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(automovel1.getId());
        System.out.println(automovel1.getRenavan());
        System.out.println(automovel1.getPlaca());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getNum_rodas());
        System.out.println(automovel1.getCombustivel());
        System.out.println(automovel1.getQuilometragem());
        System.out.println(automovel1.getChassi());
        System.out.println(automovel1.getValor_locacao());

        System.out.println(automovel2.getId());
        System.out.println(automovel2.getRenavan());
        System.out.println(automovel2.getPlaca());
        System.out.println(automovel2.getCor());
        System.out.println(automovel2.getNum_rodas());
        System.out.println(automovel2.getCombustivel());
        System.out.println(automovel2.getQuilometragem());
        System.out.println(automovel2.getChassi());
        System.out.println(automovel2.getValor_locacao());

        System.out.println(automovel3.getId());
        System.out.println(automovel3.getRenavan());
        System.out.println(automovel3.getPlaca());
        System.out.println(automovel3.getCor());
        System.out.println(automovel3.getNum_rodas());
        System.out.println(automovel3.getCombustivel());
        System.out.println(automovel3.getQuilometragem());
        System.out.println(automovel3.getChassi());
        System.out.println(automovel3.getValor_locacao());

        System.out.println(automovel4.getId());
        System.out.println(automovel4.getRenavan());
        System.out.println(automovel4.getPlaca());
        System.out.println(automovel4.getCor());
        System.out.println(automovel4.getNum_rodas());
        System.out.println(automovel4.getCombustivel());
        System.out.println(automovel4.getQuilometragem());
        System.out.println(automovel4.getChassi());
        System.out.println(automovel4.getValor_locacao());

        System.out.println(automovel5.getId());
        System.out.println(automovel5.getRenavan());
        System.out.println(automovel5.getPlaca());
        System.out.println(automovel5.getCor());
        System.out.println(automovel5.getNum_rodas());
        System.out.println(automovel5.getCombustivel());
        System.out.println(automovel5.getQuilometragem());
        System.out.println(automovel5.getChassi());
        System.out.println(automovel5.getValor_locacao());

        //Coleção List
        List<Automovel> AutomovelList = new ArrayList<>();
        AutomovelList.add(automovel1);
        AutomovelList.add(automovel2);
        AutomovelList.add(automovel3);
        AutomovelList.add(automovel4);
        AutomovelList.add(automovel5);
        System.out.print("\nPrint da lista 'AutomovelList':\n");
        System.out.println(AutomovelList);

        Automovel automovelProcurado = AutomovelList.stream().filter(automovelid3 -> automovelid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(automovelProcurado);

        System.out.print("\nOrdenando a lista por 'id':\n");
        AutomovelList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println(AutomovelList);

        //Coleção Map
        Map<Integer, Automovel> AutomovelListMap = new HashMap<>();
        AutomovelListMap.put(automovel1.getId(), automovel1);
        AutomovelListMap.put(automovel2.getId(), automovel2);
        AutomovelListMap.put(automovel3.getId(), automovel3);
        AutomovelListMap.put(automovel4.getId(), automovel4);
        AutomovelListMap.put(automovel5.getId(), automovel5);
        System.out.print("\nPrint da coleção Map 'AutomovelListMap':\n");
        System.out.println(AutomovelListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(AutomovelListMap.get(3));
    }
}
