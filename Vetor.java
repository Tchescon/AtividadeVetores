package br.unipar.vetores;

import java.awt.desktop.ScreenSleepEvent;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {

        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double nota5 = 0;

        //vetor é uma caixa onde se cria algo dentro, no caso para guardar variáveis
        //vetor é representado pelos colchetes []
        // new instancia

        //criei um vetor
        double[] notas = new double[5];
        //guardei as notas
        notas[0] = 10;
        notas[1] = 1.1;
        notas[2] = 7.3;
        notas[3] = 8.1;
        notas[4] = 3.2;

        //vetor no java é homogêneo. ou seja todos os valores são iguais, se um é double, todos são double
        //tamanho finito,é necessário dizer a ele qual seu tamanho na criação

        //usei o vetor
        double media = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
        media = media / 5;
        System.out.println("Media final é: " + media);

        System.out.println("Qual é a 3° nota " + notas[2]);
        System.out.println("Qual é a 4° nota " + notas[3]);

        String[] nomes = new String[5];
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome 1: ");
        nomes[0] = sc.nextLine();

        System.out.println("Digite o nome 2: ");
        nomes[1] = sc.nextLine();

        System.out.println("Digite o nome 3: ");
        nomes[2] = sc.nextLine();

        System.out.println("Digite o nome 4: ");
        nomes[3] = sc.nextLine();

        System.out.println("Digite o nome 5: ");
        nomes[4] = sc.nextLine();

        System.out.println("A nota do " + nomes[0] + "é" + notas[0]);



}
}
