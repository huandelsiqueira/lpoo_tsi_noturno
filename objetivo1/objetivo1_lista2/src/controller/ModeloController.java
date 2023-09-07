package controller;

import model.Modelo;

import java.util.*;

public class ModeloController {
    public static void main(String[] args) {

        Modelo modelo1 = new Modelo();
        Modelo modelo2 = new Modelo();
        Modelo modelo3 = new Modelo(3, "Guitarra de brinquedo");
        Modelo modelo4 = new Modelo(4, "Bola do golfe");
        Modelo modelo5 = new Modelo(5, "Chinelo Havaianas");

        System.out.println(modelo1);
        System.out.println(modelo2);
        System.out.println(modelo3);
        System.out.println(modelo4);
        System.out.println(modelo5);

        modelo1.setId(1);
        modelo1.setDescricao("Quadro Pink Floyd");

        modelo2.setId(2);
        modelo2.setDescricao("Camiseta Iron Maiden");

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(modelo1.getId());
        System.out.println(modelo1.getDescricao());

        System.out.println(modelo2.getId());
        System.out.println(modelo2.getDescricao());

        System.out.println(modelo3.getId());
        System.out.println(modelo3.getDescricao());

        System.out.println(modelo4.getId());
        System.out.println(modelo4.getDescricao());

        System.out.println(modelo5.getId());
        System.out.println(modelo5.getDescricao());

        //Coleção List
        List<Modelo> ModeloList = new ArrayList<>();
        ModeloList.add(modelo1);
        ModeloList.add(modelo2);
        ModeloList.add(modelo3);
        ModeloList.add(modelo4);
        ModeloList.add(modelo5);
        System.out.print("\nPrint da lista 'ModeloList':\n");
        System.out.println(ModeloList);

        Modelo modeloProcurado = ModeloList.stream().filter(modeloid3 -> modeloid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(modeloProcurado);

        System.out.print("\nOrdenando a lista por 'id':\n");
        ModeloList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println(ModeloList);

        //Coleção Map
        Map<Integer, Modelo> ModeloListMap = new HashMap<>();
        ModeloListMap.put(modelo1.getId(), modelo1);
        ModeloListMap.put(modelo2.getId(), modelo2);
        ModeloListMap.put(modelo3.getId(), modelo3);
        ModeloListMap.put(modelo4.getId(), modelo4);
        ModeloListMap.put(modelo5.getId(), modelo5);
        System.out.print("\nPrint da coleção Map 'ModeloListMap':\n");
        System.out.println(ModeloListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(ModeloListMap.get(3));
    }
}
