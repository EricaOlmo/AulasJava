/*
 Repita o exercício anterior, trocando as impressões no console por “MessageDialog”. 
 */
package br.com.Borges;

import javax.swing.JOptionPane;

public class EX02 {

    private int var1;
    private double var2;
    private float var3;
    private boolean var4;
    private String var5;

    public EX02() {
         var1 = 90;
        var2 = 680.4;
        var3 = 4.9f;
        var4 = true;
        var5 = "Testando exercicio!";
    }

    public void imprimir() {

        JOptionPane.showMessageDialog(null,
                "Ex int: " + this.var1
                + "\r\nEx double: " + this.var2
                + "\r\nEx float: " + this.var3
                + "\r\nEx boolean: " + this.var4
                + "\r\nEx String: " + this.var5);

    }
}

