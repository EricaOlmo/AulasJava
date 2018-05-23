/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.erica;

import javax.swing.JOptionPane;

/**
 *
 * @author Erica
 */
public class ImprimeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String n = JOptionPane.showInputDialog(null, "Digite um numero inteiro positivo:");
        int a = 0;
        try {
           a = Integer.parseInt(n);
           if (a < 0){
            throw new NumberFormatException("O valor deve ser positivo!");
        } 
           
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null,"Valor Incorreto \r\n"+ ex.getMessage());  
          }
        for (int i = 0; i <= a; i++) {
          if (i%2 == 1){
              JOptionPane.showMessageDialog(null, i);
        }
        }
    }
    
}
