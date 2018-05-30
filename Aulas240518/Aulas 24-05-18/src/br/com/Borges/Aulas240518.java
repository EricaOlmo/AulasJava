/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Borges;

import javax.swing.JOptionPane;

public class Aulas240518 {
    
    public static void main(String[] args) {
        boolean tmp = true;
        while (tmp == true) {
            String opcao = JOptionPane.showInputDialog("O que deseja fazer?\r\n"
                    + "1 para Primeira atividade\r\n"
                    + "2 para Segunda atividade\r\n"
                    + "3 para Terceira atividade\r\n"
                    + "4 para Quarta atividade\r\n"
                    + "5 para Quinta atividade\r\n"
                    + "6 para Sexta atividade\r\n"
                    + "7 para Sétima atividade\r\n"
                    + "8 para Oitava atividade\r\n"
                    + "9 para Nona atividade\r\n"
                    + "0 para Décima atividade\r\n"
                    + "S para sair");
            if (opcao.toUpperCase().equals("S")) {
                tmp = false;
            } else if( (opcao.equals("1")) || (opcao.equals("2")) || (opcao.equals("3"))
                    || (opcao.equals("4")) || (opcao.equals("5")) || (opcao.equals("6"))
                    || (opcao.equals("7")) || (opcao.equals("8")) || (opcao.equals("9"))
                    || (opcao.equals("0"))) {
                int opcao2 = Integer.parseInt(opcao);
                switch (opcao2) {
                    case 1:
                        EX01 one = new EX01();
                        one.imprimir();
                        break;
                    case 2:
                        EX02 two = new EX02();
                        two.imprimir();
                        break;
                    case 3:
                        EX03 three = new EX03();
                        three.operacoes();
                        break;
                    case 4:
                        EX04 four = new EX04();
                        four.ordemCrescente();
                        break;
                    case 5:
                        EX05 five = new EX05();
                        five.frase();
                        break;
                    case 6:
                        EX06 six = new EX06();
                        six.posto();
                        break;
                    case 7:
                        EX07 seven = new EX07();
                        seven.inicio();
                        break;
                    case 8:
                        EX08 eight = new EX08();
                        eight.nomeReverso();
                        break;
                    case 9:
                        EX09 nine = new EX09();
                        nine.kmLitro();
                        break;
                    case 0:
                        EX10 ten = new EX10();
                        ten.litroNecessario();
                        break;

                }
            }
        }
    }
    
}
