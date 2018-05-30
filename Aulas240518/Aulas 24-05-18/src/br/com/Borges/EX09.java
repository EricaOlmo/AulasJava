/*
 Faça um aplicativo Java que calcule a quilometragem média por litro de combustível realizada por um veículo. 
Para isso, obtenha do usuário os valores de quilômetros percorridos e litros consumidos utilizando o pacote “JOptionPane”.
 */
package br.com.Borges;

import javax.swing.JOptionPane; 

public class EX09 {
    private float km;
    private float litro;

    public void kmLitro() {
        this.km = Float.parseFloat(JOptionPane.showInputDialog("Informe o KM percorridos"));
        this.litro = Float.parseFloat(JOptionPane.showInputDialog("Informe Litros cosumidos"));
        JOptionPane.showMessageDialog(null, "A média de KM/L:   " + this.media());
    }
    public float media() {
        return (this.km / this.litro);
    }
}
