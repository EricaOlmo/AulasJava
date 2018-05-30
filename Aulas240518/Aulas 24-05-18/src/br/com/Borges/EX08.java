/*
Faça um aplicativo que receba 5 nomes e os imprima posteriormente na ordem inversa à qual recebeu.
 */
package br.com.Borges;

import javax.swing.JOptionPane; 

public class EX08 {
    
    private String[] nome;

    public EX08 () {
        nome = new String[6];
    }

    public void nomeReverso() {
        for (int i = 0; i < this.nome.length; i++) {
            this.nome[i] = JOptionPane.showInputDialog("Informe o " + (i + 1) + " nome");
        }
        for (int i = (this.nome.length - 1); i >= 0; i--) {
            System.out.printf("Nome: %s\r\n", this.nome[i]);
        }
    }
}
