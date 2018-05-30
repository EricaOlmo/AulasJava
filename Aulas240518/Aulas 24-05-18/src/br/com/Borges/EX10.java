/*
 Faça um aplicativo Java que calcule a quantidade de litros de combustível necessária para uma viagem. Para isso,
obtenha do usuário a média km/l e a distância em quilômetros. Utilize o pacote “JOptionPane” para interação com o usuário. 
 */
package br.com.Borges;

import javax.swing.JOptionPane; 

public class EX10 {
    private float kmL;
    private float distancia;
    
    public void litroNecessario() {
        this.kmL = Float.parseFloat(JOptionPane.showInputDialog("Informe a média KM/L"));
        this.distancia = Float.parseFloat(JOptionPane.showInputDialog("Informe a distância"));
        JOptionPane.showMessageDialog(null, "São necessários " + this.litroCalculo() + " litros de combústivel");
    }
    public float litroCalculo() {
        return (this.distancia / this.kmL);
    }
}
