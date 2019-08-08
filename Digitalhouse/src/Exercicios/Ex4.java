package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Ex4 {
    public static void main(String[] args) {
        Integer soma = 0;
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(6);
        numeros.add(8);
        numeros.add(9);

        for (int i = 0; i < numeros.size(); i++){
            soma = soma + numeros.get(i);

        }
        System.out.println("A soma dos elementos é " +soma);

    }
}
