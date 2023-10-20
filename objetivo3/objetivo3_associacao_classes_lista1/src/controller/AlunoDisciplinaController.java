package controller;

import model.Aluno;
import model.Disciplina;

import java.util.Comparator;

public class AlunoDisciplinaController {
    public static void main(String[] args) {

        Aluno a1 = new Aluno(1000L, "Huandel", "Siqueira");
        Aluno a2 = new Aluno(2000L, "Rafaella", "Fonseca");

        Disciplina d1 = new Disciplina(111L, "Estrutura de Dados");
        Disciplina d2 = new Disciplina(222L, "Linguagem de Programação Orientada a Objetos");
        Disciplina d3 = new Disciplina(333L, "Banco de Dados 1");

        a1.getDisciplinas().add(d1);
        a1.getDisciplinas().add(d2);

        a2.getDisciplinas().add(d1);
        a2.getDisciplinas().add(d2);
        a2.getDisciplinas().add(d3);

        System.out.print("\nDisciplinas por aluno:\n");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

        a2.getDisciplinas().clear();
        System.out.print("\nDisciplinas por aluno com aluno2 sem matrícula em disciplinas:\n");
        a1.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplinas().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

    }
}
