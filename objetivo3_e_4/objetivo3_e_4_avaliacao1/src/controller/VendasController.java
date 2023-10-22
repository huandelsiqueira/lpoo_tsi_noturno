package controller;

import model.*;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class VendasController extends MyException {
    public static void main(String[] args) {

        Vendedor vend1 = new Vendedor(2030, "Daniel", "Fernando Osório", "Três Vendas", "96485-985", "Pelotas", "RS", "Mercado Nacional");

        Fornecedor forn1 = new Fornecedor("44.867.948/0001-67", "Aliementos União - (53)98153-8695", "UniãoAlimentos");

        Produto prod1 = new Produto(111, "Massa parafuso", 20, 7.99, forn1);
        Produto prod2 = new Produto(222, "Chocolate Lacta", 45, 3.50, forn1);

        Item item1 = new Item(111, 10.00, 8, prod1);
        Item item2 = new Item(222, 12.50, 20, prod2);

        Pedido ped1 = new Pedido(4444, LocalDateTime.of(2023, 10, 15, 15, 30), item1.getQuantidade() * prod1.getPreco(), item1.getQuantidade() * prod1.getPreco() - item1.getDesconto(), Tipo.ATENDIDO, vend1);
        Pedido ped2 = new Pedido(7777, LocalDateTime.of(2023, 9, 21, 11, 25), item2.getQuantidade() * prod2.getPreco(), item2.getQuantidade() * prod2.getPreco() - item2.getDesconto() ,Tipo.ATENDIDO, vend1);

        ped1.getItens().add(item1);
        ped1.getItens().add(item2);

        List<Pedido> PedidoList = new ArrayList<>();
        PedidoList.add(ped1);
        PedidoList.add(ped2);

        System.out.println("\nRelatório de vendas realizadas:\n");
        System.out.println(PedidoList);

        if (prod1.getQuantidade() >= item1.getQuantidade() && prod2.getQuantidade() >= item2.getQuantidade()) {

            int est1, est2;

            System.out.println("\nEstoque após baixa:\n");
            est1 = prod1.getQuantidade() - item1.getQuantidade();
            est2 = prod2.getQuantidade() - item2.getQuantidade();
            System.out.println("Produto= " + prod1.getNome() + "; Quantidade= " + est1);
            System.out.println("Produto= " + prod2.getNome() + "; Quantidade= " + est2);

            System.out.println("\nValor total por produto:\n");
            System.out.println("Produto= " + prod1.getNome() + "; Total= R$ " + ped1.getValorTotalPedido());
            System.out.println("Produto= " + prod2.getNome() + "; Total= R$ " + ped2.getValorTotalPedido());
            System.out.println("Vendedor= " + vend1.getNome());

            prod1.setQuantidade(prod1.getQuantidade() + 30);
            prod2.setQuantidade(prod2.getQuantidade() + 25);

            Fornecimento fornecimento1 = new Fornecimento(LocalDateTime.of(2023, 10, 22, 14, 25), prod1.getPreco() * 30, forn1, prod1);
            Fornecimento fornecimento2 = new Fornecimento(LocalDateTime.of(2023, 10, 21, 17, 40), prod2.getPreco() * 25, forn1, prod2);

            List<Fornecimento> FornecimentoList = new ArrayList<>();
            FornecimentoList.add(fornecimento1);
            FornecimentoList.add(fornecimento2);
            System.out.println("\nRelatório de fornecimentos:\n");
            System.out.println(FornecimentoList);
            double totalFornecido = 0;
            for (Fornecimento fornecimento: FornecimentoList) {
                totalFornecido += fornecimento.getValorTotal();
            }
            System.out.println("\nValor total de gastos com fornecimento:\n");
            System.out.println(NumberFormat.getCurrencyInstance().format(totalFornecido));

        } else getError();

    }
}
