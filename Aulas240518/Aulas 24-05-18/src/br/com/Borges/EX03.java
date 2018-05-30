/*
  Escreva um código capaz de realizar as quatro operações matemáticas básicas (soma, subtração, multiplicação e divisão) 
interagindo com usuário por meio do pacote “JOptionPane”. 
 */
package br.com.Borges;

import javax.swing.JOptionPane;

public class EX03 {
    

    private String operacao;
    private float num;
    private float resultado;

    public EX03() {
        operacao = "";
        num = 0;
        resultado = 0;
    }

    public void operacoes() {
        this.num = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));

        while (true) {
            String tmpOp = JOptionPane.showInputDialog("Qual é a operação?\r\n"
                    + "+     SOMA\r\n"
                    + "-     SUBTRAÇÃO\r\n"
                    + "*     MULTIPLICAÇÃO\r\n"
                    + "/     DIVISÃO\r\n"
                    + "\r\nS     SAIR");

            if (tmpOp.equals("S")) {
                System.out.printf("O resultado final: %.2f\r\n", this.resultado);
                break;
            } else {
                this.operacao = tmpOp;
                float tmpNum = Integer.parseInt(JOptionPane.showInputDialog("Informe um número"));
                this.calculo(tmpNum);
                JOptionPane.showMessageDialog(null, "Resultado: " + this.resultado);
                System.out.printf("O resultado: %.2f\r\n", this.resultado);
            }
        }
    }

    public void calculo(float tmpNum2) {
        switch (this.operacao) {
            case "+":
                this.resultado = this.num + tmpNum2;
                break;
            case "-":
                this.resultado = this.num - tmpNum2;
                break;
            case "*":
                this.resultado = this.num * tmpNum2;
                break;
            case "/":
                this.resultado = this.num / tmpNum2;
                break;
            default:
                System.out.println("erro");
                break;
        }
        this.num = this.resultado;

    }
}

