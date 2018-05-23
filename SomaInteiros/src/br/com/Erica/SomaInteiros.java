/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Erica;

import javax.swing.JOptionPane;

/**
 *
 * @author Erica
 */
public class SomaInteiros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um numero inteiro positivo:"));
        int soma = 0;
        for (int i = 1; i <= n; i++){
           soma = soma + i;
        }
        JOptionPane.showMessageDialog(null, soma);
    }
    
}
