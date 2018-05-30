/* Escreva um código onde seja declarado, atribuído, e posteriormente impresso o
valor atribuído a cada variável no console (System.out.printf(“”)).
Este código deve conter uma variável para cada um dos tipos a seguir: int, double, float, boolean, String*/

package br.com.Borges;

/**
 *
 * @author Erica
 */
public class EX01 {
      private int var1;
    private double var2;
    private float var3;
    private boolean var4;
    private String var5;

    public EX01() {
        var1 = 90;
        var2 = 680.4;
        var3 = 4.9f;
        var4 = true;
        var5 = "Testando exercicio!";
    }
    
    public void imprimir() {
        
        System.out.printf("Ex int: %d\r\nEx double: %f\r\n"
                + "Ex float: %f\r\nEx boolean: %b\r\n"
                + "Ex String: %s\r\n", this.var1, this.var2, this.var3, this.var4, this.var5);
        
    }
}
