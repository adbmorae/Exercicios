package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class TarefaEx1 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(8);
        numeros.add(10);

        int maior = numeros.get(0);

        for (int i = 0; i < numeros.size() ; i++) {
            if (numeros.get(i) > maior){
                maior = numeros.get(i);

            }
            
        }
        System.out.println(" O Maior é " + maior);

    }
}
