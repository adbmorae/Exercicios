package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class Ex5{
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(3);
        numeros.add(6);
        numeros.add(9);
        numeros.add(22);
        numeros.add(11);

        Integer somaPares = 0;

        for (int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) %2 == 0){
                somaPares = somaPares + numeros.get(i);

            }
        }
        System.out.println(" A soma dos PAres é " + somaPares);
    }
}
