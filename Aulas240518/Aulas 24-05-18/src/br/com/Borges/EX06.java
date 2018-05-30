/*Faça um aplicativo Java que receba do usuário o nome de três postos de combustíveis com seus respectivos valores de combustíveis, 
posteriormente exiba para o usuário qual o nome do posto de combustível com menor preço. */
package br.com.Borges;

import javax.swing.JOptionPane;

public class EX06 {
      private String[] nome;
    private float[] valor;

    public EX06() {
        nome = new String[3];
        valor = new float[3];
    }

    public void posto() {
        for (int i = 0; i < this.nome.length; i++) {
            this.nome[i] = JOptionPane.showInputDialog("Informe o nome do " + (i + 1) + " posto");
            this.valor[i] = Float.parseFloat(JOptionPane.showInputDialog("Informe o valor do combustivel no posto " + (i + 1)));
        }
        this.ordenar();
        this.imprimir();

    }

    public boolean ordenar() {
        int x = 0;
        String tmp;
        float tmp2;
        while (x < (this.nome.length - 1)) {
            if (this.valor[x] > this.valor[x + 1]) {
                tmp = this.nome[x];
                tmp2 = this.valor[x];
                this.nome[x] = this.nome[x + 1];
                this.valor[x] = this.valor[x + 1];
                this.nome[x + 1] = tmp;
                this.valor[x + 1] = tmp2;
                x = 0;
            } else {
                x++;
            }
        }
        return true;
    }

    public void imprimir() {
        System.out.println("Posto com menor preço");
        for (int i = 0; i < this.nome.length; i++) {
            System.out.printf("Posto: %s\tPreço: %.2f\r\n", this.nome[i], this.valor[i]);
        }
    }
}
