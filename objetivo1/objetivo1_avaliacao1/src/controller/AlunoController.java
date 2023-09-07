package controller;

import model.Aluno;

import java.util.*;

public class AlunoController {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno(2, 222222222, "José", "Almeida", "jose@gmail.com");
        Aluno aluno3 = new Aluno(3, 333333333);
        Aluno aluno4 = new Aluno();
        Aluno aluno5 = new Aluno(5, 555555555, "Carlos", "Gonçalves", "carlos@gmail.com");
        Aluno aluno6 = new Aluno(6, 666666666);

        System.out.print("Print das instâncias utilizando o comportamento toString:");
        System.out.println(aluno1);
        System.out.println(aluno2);
        System.out.println(aluno3);
        System.out.println(aluno4);
        System.out.println(aluno5);
        System.out.println(aluno6);

        //Alterando os estados dos objetos utilizando os métodos Setters
        aluno1.setId(1);
        aluno1.setCpf(111111111);
        aluno1.setNome("Maria");
        aluno1.setSobrenome("Silva");
        aluno1.setEmail("maria@gmail.com");

        aluno4.setId(4);
        aluno4.setCpf(444444444);
        aluno4.setNome("Joana");
        aluno4.setSobrenome("Soares");
        aluno4.setEmail("joana@gmail.com");

        //Print dos objetos alterados utilizando os métodos Getters
        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        System.out.println(aluno4.getId());
        System.out.println(aluno4.getCpf());
        System.out.println(aluno4.getNome());
        System.out.println(aluno4.getSobrenome());
        System.out.println(aluno4.getEmail());

        //Criação da coleção do tipo List
        List<Aluno> AlunoList = new ArrayList<>();
        AlunoList.add(aluno1);
        AlunoList.add(aluno2);
        AlunoList.add(aluno3);
        AlunoList.add(aluno4);
        AlunoList.add(aluno5);
        AlunoList.add(aluno6);

        //Criação da coleção do tipo Map
        Map<Integer, Aluno> AlunoListMap = new HashMap<>();
        AlunoListMap.put(aluno1.getId(), aluno1);
        AlunoListMap.put(aluno2.getId(), aluno2);
        AlunoListMap.put(aluno3.getId(), aluno3);
        AlunoListMap.put(aluno4.getId(), aluno4);
        AlunoListMap.put(aluno5.getId(), aluno5);
        AlunoListMap.put(aluno6.getId(), aluno6);

        System.out.print("Print da coleção do tipo List:");
        System.out.println(AlunoList);

        System.out.print("Print da coleção do tipo Map:");
        System.out.println(AlunoListMap);

        //Pesquisando o objeto com id = 5 na coleção do tipo List
        Aluno alunoProcurado = AlunoList.stream().filter(idaluno -> idaluno.getId() == 5).findAny().orElse(null);
        System.out.print("Print do objeto com id = 5 na coleção do tipo List:");
        System.out.println(alunoProcurado);

        //Pesquisando o objeto com id = 5 na coleção do tipo Map
        System.out.print("Print do objeto com id = 5 na coleção do tipo Map:");
        System.out.println(AlunoListMap.get(5));

        //Ordenando a coleção do tipo List em ordem decrescente
        AlunoList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.print("Print da coleção do tipo List em ordem decrescente:");
        System.out.println(AlunoList);

    }
}
