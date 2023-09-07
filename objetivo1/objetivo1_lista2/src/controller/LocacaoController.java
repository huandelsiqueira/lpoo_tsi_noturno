package controller;

import model.Locacao;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class LocacaoController {
    public static void main(String[] args) {

        Locacao locacao1 = new Locacao();
        Locacao locacao2 = new Locacao();
        Locacao locacao3 = new Locacao(3, LocalDate.parse("2023-08-20"), LocalTime.parse("19:30"), LocalDate.parse("2023-09-20"), LocalTime.parse("14:00"), 10000, 180.00, false);
        Locacao locacao4 = new Locacao(4, LocalDate.parse("2023-05-15"), LocalTime.parse("15:45"), LocalDate.parse("2023-08-10"), LocalTime.parse("18:00"), 23450, 79.00, true);
        Locacao locacao5 = new Locacao(5, LocalDate.parse("2023-03-10"), LocalTime.parse("19:30"), LocalDate.parse("2023-04-10"), LocalTime.parse("14:00"), 25000, 300.00, true);

        System.out.println(locacao1);
        System.out.println(locacao2);
        System.out.println(locacao3);
        System.out.println(locacao4);
        System.out.println(locacao5);

        locacao1.setId(1);
        locacao1.setDataLocacao(LocalDate.parse("2022-08-01"));
        locacao1.setHoraLocacao(Time.valueOf(LocalTime.parse("12:30")));
        locacao1.setDataDevolucao(LocalDate.parse("2022-12-21"));
        locacao1.setHoraDevolucao(Time.valueOf(LocalTime.parse("19:30")));
        locacao1.setQuilometragem(291000);
        locacao1.setValorCalcao(45.99);
        locacao1.setDevolvido(true);

        locacao2.setId(2);
        locacao2.setDataLocacao(LocalDate.parse("2023-07-21"));
        locacao2.setHoraLocacao(Time.valueOf(LocalTime.parse("07:00")));
        locacao2.setDataDevolucao(LocalDate.parse("2023-11-21"));
        locacao2.setHoraDevolucao(Time.valueOf(LocalTime.parse("10:30")));
        locacao2.setQuilometragem(9500);
        locacao2.setValorCalcao(100.50);
        locacao2.setDevolvido(false);

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(locacao1.getId());
        System.out.println(locacao1.getDataLocacao());
        System.out.println(locacao1.getHoraLocacao());
        System.out.println(locacao1.getDataDevolucao());
        System.out.println(locacao1.getHoraDevolucao());
        System.out.println(locacao1.getQuilometragem());
        System.out.println(locacao1.getValorCalcao());
        System.out.println(locacao1.getDevolvido());

        System.out.println(locacao2.getId());
        System.out.println(locacao2.getDataLocacao());
        System.out.println(locacao2.getHoraLocacao());
        System.out.println(locacao2.getDataDevolucao());
        System.out.println(locacao2.getHoraDevolucao());
        System.out.println(locacao2.getQuilometragem());
        System.out.println(locacao2.getValorCalcao());
        System.out.println(locacao2.getDevolvido());

        System.out.println(locacao3.getId());
        System.out.println(locacao3.getDataLocacao());
        System.out.println(locacao3.getHoraLocacao());
        System.out.println(locacao3.getDataDevolucao());
        System.out.println(locacao3.getHoraDevolucao());
        System.out.println(locacao3.getQuilometragem());
        System.out.println(locacao3.getValorCalcao());
        System.out.println(locacao3.getDevolvido());

        System.out.println(locacao4.getId());
        System.out.println(locacao4.getDataLocacao());
        System.out.println(locacao4.getHoraLocacao());
        System.out.println(locacao4.getDataDevolucao());
        System.out.println(locacao4.getHoraDevolucao());
        System.out.println(locacao4.getQuilometragem());
        System.out.println(locacao4.getValorCalcao());
        System.out.println(locacao4.getDevolvido());

        System.out.println(locacao5.getId());
        System.out.println(locacao5.getDataLocacao());
        System.out.println(locacao5.getHoraLocacao());
        System.out.println(locacao5.getDataDevolucao());
        System.out.println(locacao5.getHoraDevolucao());
        System.out.println(locacao5.getQuilometragem());
        System.out.println(locacao5.getValorCalcao());
        System.out.println(locacao5.getDevolvido());

        //Coleção List
        List<Locacao> LocacaoList = new ArrayList<>();
        LocacaoList.add(locacao1);
        LocacaoList.add(locacao2);
        LocacaoList.add(locacao3);
        LocacaoList.add(locacao4);
        LocacaoList.add(locacao5);
        System.out.print("\nPrint da lista 'Locacao':\n");
        System.out.println(LocacaoList);

        Locacao locacaoProcurada = LocacaoList.stream().filter(locacaoid3 -> locacaoid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(locacaoProcurada);

        System.out.print("\nOrdenando a lista por 'id':\n");
        LocacaoList.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println(LocacaoList);

        //Coleção Map
        Map<Integer, Locacao> LocacaoListMap = new HashMap<>();
        LocacaoListMap.put(locacao1.getId(), locacao1);
        LocacaoListMap.put(locacao2.getId(), locacao2);
        LocacaoListMap.put(locacao3.getId(), locacao3);
        LocacaoListMap.put(locacao4.getId(), locacao4);
        LocacaoListMap.put(locacao5.getId(), locacao5);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(LocacaoListMap.get(3));

    }
}
