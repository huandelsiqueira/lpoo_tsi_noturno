package controller;

import model.Bicicleta;
import model.Caminhao;
import model.Carro;

public class VeiculoController {
    public static void main(String[] args) {

        Bicicleta b1 = new Bicicleta(2, "Humana", "Prince", "Rua", 2017, 26, "123aaa");
        System.out.println(b1);

        Carro c1 = new Carro(2, "Gasolina", "Volkswagen", "Variante", 1967, 45, "1020304050", "123bbb", "BBB-111");
        System.out.println(c1);

        Caminhao cam1 = new Caminhao(8, "Diesel", "Volvo", "FH 540", 2016, 400, "8090100102", "123ccc", "CCC-222");
        System.out.println(cam1);
    }
}
