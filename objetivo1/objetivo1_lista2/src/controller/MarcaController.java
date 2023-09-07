package controller;

import model.Marca;

import java.util.*;

public class MarcaController {
    public static void main(String[] args) {

        Marca marca1 = new Marca();
        Marca marca2 = new Marca();
        Marca marca3 = new Marca(3, "Coca-Cola");
        Marca marca4 = new Marca(4, "Adidas");
        Marca marca5 = new Marca(5, "Nike");

        System.out.println(marca1);
        System.out.println(marca2);
        System.out.println(marca3);
        System.out.println(marca4);
        System.out.println(marca5);

        marca1.setId(1);
        marca1.setDescricao("Mormaii");

        marca2.setId(2);
        marca2.setDescricao("Motorola");

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(marca1.getId());
        System.out.println(marca1.getDescricao());

        System.out.println(marca2.getId());
        System.out.println(marca2.getDescricao());

        System.out.println(marca3.getId());
        System.out.println(marca3.getDescricao());

        System.out.println(marca4.getId());
        System.out.println(marca4.getDescricao());

        System.out.println(marca5.getId());
        System.out.println(marca5.getDescricao());

        //Coleção List
        List<Marca> MarcaList = new ArrayList<>();
        MarcaList.add(marca1);
        MarcaList.add(marca2);
        MarcaList.add(marca3);
        MarcaList.add(marca4);
        MarcaList.add(marca5);
        System.out.print("\nPrint da lista 'Marca':\n");
        System.out.println(MarcaList);

        Marca marcaProcurada = MarcaList.stream().filter(marcaid3 -> marcaid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(marcaProcurada);

        System.out.print("\nOrdenando a lista por 'id':\n");
        MarcaList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println(MarcaList);

        //Coleção Map
        Map<Integer, Marca> MarcaListMap = new HashMap<>();
        MarcaListMap.put(marca1.getId(), marca1);
        MarcaListMap.put(marca2.getId(), marca2);
        MarcaListMap.put(marca3.getId(), marca3);
        MarcaListMap.put(marca4.getId(), marca4);
        MarcaListMap.put(marca5.getId(), marca5);
        System.out.print("\nPrint da coleção Map 'MarcaListMap':\n");
        System.out.println(MarcaListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(MarcaListMap.get(3));

    }
}
