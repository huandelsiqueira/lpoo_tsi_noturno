package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.util.Comparator;

public class UberController {
    public static void main(String[] args) {

        Usuario user = new Usuario(11L,"Huandel", "huandel@gmail.com", "(53) 98576-5449");

        Veiculo veic = new Veiculo(7777L, "Carro", "IDN-4938", 2018);

        Motorista mot = new Motorista(55L, "Cássio", "cassio@gmail.com", "(21) 98175-7564", veic);

        Corrida corr1 = new Corrida(3333L, "Dinheiro", "Cédulas e moedas", LocalDateTime.of(2023, 10, 19, 18,55), 11.90, mot, user);
        Corrida corr2 = new Corrida(4444L, "Cartão de crédito", "Bandeira MasterCard", LocalDateTime.of(2023, 9, 15, 15, 30), 22.50, mot, user);

        user.getCorridas().add(corr1);
        user.getCorridas().add((corr2));

        System.out.println("Corridas por usuário:\n");
        user.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(user.getCorridas());

        mot.getCorridas().add(corr1);
        mot.getCorridas().add(corr2);

        System.out.println("Corridas por motorista:\n");
        mot.getCorridas().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        System.out.println(mot.getCorridas());

        System.out.println("\nValor Total das corridas:");
        System.out.print("Motorista = " + mot.getNome());
        System.out.println("\nValor = " + NumberFormat.getCurrencyInstance().format(mot.getCorridas().stream().mapToDouble(corrida -> corrida.getPreco()).sum()));

    }
}
