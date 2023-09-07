package controller;

import model.Cliente;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();
        Cliente cliente2 = new Cliente();
        Cliente cliente3 = new Cliente(3,"11111111-11", "Huandel", "Siqueira", "Av. Machado", "11111-11", "5398111-1111", "huandel@gmail.com");
        Cliente cliente4 = new Cliente(4,"22222222-22", "Maria", "Silva", "Rua Andradas", "22222-22", "5498222-2222", "maria@gmail.com");
        Cliente cliente5 = new Cliente(5,"33333333-33", "José", "Peixoto", "Av. Pinheiro", "33333-33", "2198333-3333", "jose@gmail.com");

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(cliente4);
        System.out.println(cliente5);

        cliente1.setId(1);
        cliente1.setCpf("44444444-44");
        cliente1.setNome("João");
        cliente1.setSobrenome("Corleone");
        cliente1.setEndereco("Rua dos Alfineiros");
        cliente1.setCep("44444-44");
        cliente1.setTelefone("219994444-4444");
        cliente1.setEmail("joao@gmail.com");

        cliente2.setId(2);
        cliente2.setCpf("55555555-55");
        cliente2.setNome("Eduardo");
        cliente2.setSobrenome("Barzini");
        cliente2.setEndereco("Rua Sem Saída");
        cliente2.setCep("55555-55");
        cliente2.setTelefone("219995555-5555");
        cliente2.setEmail("eduardo@gmail.com");

        System.out.print("\nPrint utilizando os Getters da classe:\n");
        System.out.println(cliente1.getId());
        System.out.println(cliente1.getCpf());
        System.out.println(cliente1.getNome());
        System.out.println(cliente1.getSobrenome());
        System.out.println(cliente1.getEndereco());
        System.out.println(cliente1.getCep());
        System.out.println(cliente1.getTelefone());
        System.out.println(cliente1.getEmail());

        System.out.println(cliente2.getId());
        System.out.println(cliente2.getCpf());
        System.out.println(cliente2.getNome());
        System.out.println(cliente2.getSobrenome());
        System.out.println(cliente2.getEndereco());
        System.out.println(cliente2.getCep());
        System.out.println(cliente2.getTelefone());
        System.out.println(cliente2.getEmail());

        System.out.println(cliente3.getId());
        System.out.println(cliente3.getCpf());
        System.out.println(cliente3.getNome());
        System.out.println(cliente3.getSobrenome());
        System.out.println(cliente3.getEndereco());
        System.out.println(cliente3.getCep());
        System.out.println(cliente3.getTelefone());
        System.out.println(cliente3.getEmail());

        System.out.println(cliente4.getId());
        System.out.println(cliente4.getCpf());
        System.out.println(cliente4.getNome());
        System.out.println(cliente4.getSobrenome());
        System.out.println(cliente4.getEndereco());
        System.out.println(cliente4.getCep());
        System.out.println(cliente4.getTelefone());
        System.out.println(cliente4.getEmail());

        System.out.println(cliente5.getId());
        System.out.println(cliente5.getCpf());
        System.out.println(cliente5.getNome());
        System.out.println(cliente5.getSobrenome());
        System.out.println(cliente5.getEndereco());
        System.out.println(cliente5.getCep());
        System.out.println(cliente5.getTelefone());
        System.out.println(cliente5.getEmail());

        //Coleção List
        List<Cliente> ClienteList = new ArrayList<>();
        ClienteList.add(cliente1);
        ClienteList.add(cliente2);
        ClienteList.add(cliente3);
        ClienteList.add(cliente4);
        ClienteList.add(cliente5);
        System.out.print("\nPrint da lista 'Cliente':\n");
        System.out.println(ClienteList);

        Cliente clienteProcurado = ClienteList.stream().filter(clienteid3 -> clienteid3.getId() == 3).findAny().orElse(null);
        System.out.print("\nPesquisando o objeto com 'id=3':");
        System.out.println(clienteProcurado);

        System.out.print("\nOrdenando a lista por 'id':\n");
        ClienteList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println(ClienteList);

        //Coleção Map
        Map<Integer, Cliente> ClienteListMap = new HashMap<>();
        ClienteListMap.put(cliente1.getId(), cliente1);
        ClienteListMap.put(cliente2.getId(), cliente2);
        ClienteListMap.put(cliente3.getId(), cliente3);
        ClienteListMap.put(cliente4.getId(), cliente4);
        ClienteListMap.put(cliente5.getId(), cliente5);
        System.out.print("\nPrint da coleção Map 'ClienteListMap':\n");
        System.out.println(ClienteListMap);

        System.out.print("\nPesquisando na lista Map por 'id=3':");
        System.out.println(ClienteListMap.get(3));

    }
}
