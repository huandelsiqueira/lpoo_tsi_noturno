package controller;

import model.Fornecedor;
import model.Fornecimento;
import model.Produto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FornecedorFornecimentoController {
    public static void main(String[] args) {

        Fornecedor f1 = new Fornecedor("75.433.223/0001-50", "Joana 53959485858", "Mercado Joia");
        Fornecedor f2 = new Fornecedor("83.987.209/0001-63", "Leandro 21985649885", "PneusFormula");

        Produto p1 = new Produto(111, "Pneu", 300, 187.50,f2);
        Produto p2 = new Produto(222, "Frango", 80, 10.50, f1);
        Produto p3 = new Produto(333, "Desodorante", 150, 5.99,f1);

        Fornecimento forn1 = new Fornecimento(LocalDateTime.of(2022, 7, 24, 13, 30), p1.getPreco()*p1.getQuantidade(),p1,f2);
        Fornecimento forn2 = new Fornecimento(LocalDateTime.of(2023, 11, 16, 7, 30), p1.getPreco()*p1.getQuantidade(),p2,f1);
        Fornecimento forn3 = new Fornecimento(LocalDateTime.of(2020, 8, 21, 9, 45), p1.getPreco()*p1.getQuantidade(),p3,f1);

        List<Fornecimento> FornecimentoList = new ArrayList<>();
        FornecimentoList.add(forn1);
        FornecimentoList.add(forn2);
        FornecimentoList.add(forn3);
        System.out.println("\nLista de fornecimentos:\n");
        System.out.println(FornecimentoList);

        int totalforn = 0;
        for (Fornecimento forn : FornecimentoList ) {
            totalforn += forn.getProduto().getQuantidade();
        }
        System.out.println("\nTotal fornecido = " + totalforn + " unidades");

    }
}
