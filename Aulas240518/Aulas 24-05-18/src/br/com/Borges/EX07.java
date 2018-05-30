/*
 Faça um aplicativo que mantenha em um array 6 números dados pelo usuário,
posteriormente faça o sorteio de 6 números aleatórios entre 0 e 60,
comparando o resultado do sorteio com os números posteriormente informado. 
Faça este sorteio e comparação em alguns laços for repetindo 1000, 10.000, 100.000, 1.000.000 de vezes.
Para cada laço contabilize quantos sorteios acertaram os 6 números e no final apresente ao usuário esta estatística. 
 */
package br.com.Borges;

import java.util.Random;
import javax.swing.JOptionPane;

public class EX07 {
     private int[] num;
    private int[][] acertos;
    private int[] nome = {1000, 10000, 100000, 1000000};

    public EX07() {
        num = new int[6];
        acertos = new int[6][4];
    }

    public void inicio() {
        for (int i = 0; i < this.num.length; i++) {
            this.num[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o " + (i + 1) + " número de 0 a 60"));
        }
        this.sorteio();
        this.imprimir();
    }

    public void imprimir() {
        for (int i = 0; i < 4; i++) {
            System.out.printf("No sorteio de %d, os números:\r\n"
                    + "%d foi sorteado %d vezes\r\n"
                    + "%d foi sorteado %d vezes\r\n"
                    + "%d foi sorteado %d vezes\r\n"
                    + "%d foi sorteado %d vezes\r\n"
                    + "%d foi sorteado %d vezes\r\n"
                    + "%d foi sorteado %d vezes\r\n\r\n",
                    this.nome[i],
                    this.num[0], this.acertos[0][i],
                    this.num[1], this.acertos[1][i],
                    this.num[2], this.acertos[2][i],
                    this.num[3], this.acertos[3][i],
                    this.num[4], this.acertos[4][i],
                    this.num[5], this.acertos[5][i]);
        }
    }

    public void sorteio() {
        Random ran = new Random();
        for (int p = 0; p < 4; p++) {
            for (int i = 0; i < this.nome[p]; i++) {
                int x = ran.nextInt(61);
                if (x == this.num[0]) {
                    this.acertos[0][p]++;
                } else if (x == this.num[1]) {
                    this.acertos[1][p]++;
                } else if (x == this.num[2]) {
                    this.acertos[2][p]++;
                } else if (x == this.num[3]) {
                    this.acertos[3][p]++;
                } else if (x == this.num[4]) {
                    this.acertos[4][p]++;
                } else if (x == this.num[5]) {
                    this.acertos[5][p]++;
                }
            }
        }
    }
}
