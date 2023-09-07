package controller;

import model.Produto;

import java.util.*;

public class ProdutoController {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        Produto produto3 = new Produto(3, "Monitor", "Monitor AOC", 649.99, 250);
        Produto produto4 = new Produto(4, "Mouse", "Mouse Razer", 147.69, 100);
        Produto produto5 = new Produto(5,"Teclado", "Teclado mecânico", 268.99, 70);

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
        System.out.println(produto5);

        produto1.setId(1);
        produto1.setNome("Memória RAM");
        produto1.setDescricao("Memória RAM 8Gb DDR4");
        produto1.setValor(189.99);
        produto1.setEstoque(900);

        produto2.setId(2);
        produto2.setNome("Placa de Vídeo");
        produto2.setDescricao("Placa de Vídeo NVIDIA GeForce GTX 1050 2Gb");
        produto2.setValor(839.89);
        produto2.setEstoque(50);

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(produto1.getId());
        System.out.println(produto1.getNome());
        System.out.println(produto1.getDescricao());
        System.out.println(produto1.getValor());
        System.out.println(produto1.getEstoque());

        System.out.println(produto2.getId());
        System.out.println(produto2.getNome());
        System.out.println(produto2.getDescricao());
        System.out.println(produto2.getValor());
        System.out.println(produto2.getEstoque());

        System.out.println(produto3.getId());
        System.out.println(produto3.getNome());
        System.out.println(produto3.getDescricao());
        System.out.println(produto3.getValor());
        System.out.println(produto3.getEstoque());

        System.out.println(produto4.getId());
        System.out.println(produto4.getNome());
        System.out.println(produto4.getDescricao());
        System.out.println(produto4.getValor());
        System.out.println(produto4.getEstoque());

        System.out.println(produto5.getId());
        System.out.println(produto5.getNome());
        System.out.println(produto5.getDescricao());
        System.out.println(produto5.getValor());
        System.out.println(produto5.getEstoque());

        //Coleção List
        List<Produto> ProdutoList = new ArrayList<>();
        ProdutoList.add(produto1);
        ProdutoList.add(produto2);
        ProdutoList.add(produto3);
        ProdutoList.add(produto4);
        ProdutoList.add(produto5);
        System.out.print("\nPrint da lista 'ProdutoList':\n");
        System.out.println(ProdutoList);

        Produto produtoProcurado = ProdutoList.stream().filter(produtoid3 -> produtoid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(produtoProcurado);

        System.out.print("\nOrdenando a lista por 'id':\n");
        ProdutoList.sort(Comparator.comparing(Produto::getId).reversed());
        System.out.println(ProdutoList);

        //Coleção Map
        Map<Integer, Produto> ProdutoListMap = new HashMap<>();
        ProdutoListMap.put(produto1.getId(), produto1);
        ProdutoListMap.put(produto2.getId(), produto2);
        ProdutoListMap.put(produto3.getId(), produto3);
        ProdutoListMap.put(produto4.getId(), produto4);
        ProdutoListMap.put(produto5.getId(), produto5);
        System.out.print("\nPrint da coleção Map 'ProdutoListMap':\n");
        System.out.println(ProdutoListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(ProdutoListMap.get(3));
    }
}
