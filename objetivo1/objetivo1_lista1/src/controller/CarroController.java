package controller;

import model.Carro;

import java.util.*;

public class CarroController {
    public static void main(String[] args) {

        Carro carro1 = new Carro();
        Carro carro2 = new Carro();
        Carro carro3 = new Carro(3, "Volkswagen", "Fox", 2013);
        Carro carro4 = new Carro(4, "Ferrari", "F40", 1987);
        Carro carro5 = new Carro(5, "Mercedes", "AMG A45", 2013);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro4);
        System.out.println(carro5);

        carro1.setId(1);
        carro1.setMarca("Fiat");
        carro1.setModelo("147");
        carro1.setAnoFabricacao(1976);

        carro2.setId(2);
        carro2.setMarca("Ford");
        carro2.setModelo("Fusion");
        carro2.setAnoFabricacao(2018);

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(carro1.getId());
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getAnoFabricacao());

        System.out.println(carro2.getId());
        System.out.println(carro2.getMarca());
        System.out.println(carro2.getModelo());
        System.out.println(carro3.getAnoFabricacao());

        System.out.println(carro3.getId());
        System.out.println(carro3.getMarca());
        System.out.println(carro3.getModelo());
        System.out.println(carro3.getAnoFabricacao());

        System.out.println(carro4.getId());
        System.out.println(carro4.getMarca());
        System.out.println(carro4.getModelo());
        System.out.println(carro4.getAnoFabricacao());

        System.out.println(carro5.getId());
        System.out.println(carro5.getMarca());
        System.out.println(carro5.getModelo());
        System.out.println(carro5.getAnoFabricacao());

        //Coleção List
        List<Carro> CarroList = new ArrayList<>();
        CarroList.add(carro1);
        CarroList.add(carro2);
        CarroList.add(carro3);
        CarroList.add(carro4);
        CarroList.add(carro5);
        System.out.print("\nPrint da lista 'CarroList':\n");
        System.out.println(CarroList);

        Carro carroProcurado = CarroList.stream().filter(carroid3 -> carroid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(carroProcurado);

        System.out.print("\nOrdenando a lista por 'id':\n");
        CarroList.sort(Comparator.comparing(Carro::getId).reversed());
        System.out.println(CarroList);

        //Coleção Map
        Map<Integer, Carro> CarroListMap = new HashMap<>();
        CarroListMap.put(carro1.getId(), carro1);
        CarroListMap.put(carro2.getId(), carro2);
        CarroListMap.put(carro3.getId(), carro3);
        CarroListMap.put(carro4.getId(), carro4);
        CarroListMap.put(carro5.getId(), carro5);
        System.out.print("\nPrint da coleção Map 'CarroListMap':\n");
        System.out.println(CarroListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(CarroListMap.get(3));

    }
}
