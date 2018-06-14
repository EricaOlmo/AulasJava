
package br.com.Erica;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class MinhaTela extends JFrame implements ActionListener {
    
    //variaveis no escopo para usar em todo o codigo
     JLabel labelValor1, labelValor2; // é o label
     JTextField txtValor1, txtValor2; // é o preenchimento de texto
     JButton meuBotao; // variavel botao
     
     
    public MinhaTela() throws HeadlessException { // só escrever minha tela ctrl+espaço e automaicamente ele ja cria
        super("Minha 2ª tela");
        this.setSize(400, 200);// é o metodo que ja havia criado na outra para o tamanho da tela
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.desenharBotoes(); //metodo que não existe ainda dentro deste construtor, esse metodo é para criar botões na tela
        this.setVisible(true);
    }

    private void desenharBotoes() { //vou desenhar botoes na tela adicionando metodosque ja existem
        Font fonte = new Font("eater", Font.PLAIN, 20); // definindo fonte e tamanho da letra
        this.setLayout(new FlowLayout()); //criando um layout do tipo manager
        Dimension tamanhoLabel = new Dimension(100, 20);//tamanho da label
        Dimension tamanhoCampo = new Dimension(230, 20);//tamanho do campo
        
        this.labelValor1 = new JLabel (); // metodo
        this.labelValor1.setText("Valor 1");
        this.labelValor1.setPreferredSize(tamanhoLabel); //tamanho dos elementos, ajustar tipo em tabela
        this.labelValor1.setFont(fonte);
        this.labelValor1.setForeground(Color.red); // colocando cor na fonte
        this.add(labelValor1); //adicionar qualquer componente 
        
        this.txtValor1 = new JTextField(); //vazio para ususario digitar
        //this.txtValor1.setBackground(Color.orange); //cor de fundo no text
        this.txtValor1.setPreferredSize(tamanhoCampo);
        this.add(txtValor1);// recebe o valor digitado
        
        this.labelValor2 = new JLabel("Valor 2"); 
        this.labelValor2.setPreferredSize(tamanhoLabel);
        this.add(labelValor2); //paraaparecer do lado do outro
        
        this.txtValor2 = new JTextField();
        this.txtValor2.setPreferredSize(tamanhoCampo);
        this.add(txtValor2);

        this.meuBotao = new JButton("Meu botao"); //criando o botão e colocandoum texto nele
        MeuListener ml = new MeuListener(); //outro botao que recebe o action listener
        this.meuBotao.addActionListener(ml);
        this.meuBotao.addActionListener(this); // adicionar eventos-- this éo listenerque vai ser o metodo que está abaixo
        this.meuBotao.setActionCommand("calcular");// comando do botão
        this.add(meuBotao); // adicionando o botao na tela
        
    }

    @Override
    public void actionPerformed(ActionEvent e) { //cada botao que eu precisar de uma açao faço nesse metodo
        if (e.getActionCommand().equals("calcular")) {//variavel (e) é equals
            int soma = 0; //iniciando a variavel
            String txtVl1 = this.txtValor1.getText(); //busca o valor digitado no text  e preenche
            String txtVl2 = this.txtValor2.getText();
            if (txtVl1.isEmpty() || !txtVl1.matches("[0-9]+") ){ //validando campo que nao pode ficar vazio e nem pode ser texto
                JOptionPane.showMessageDialog(null, "Valor 1 invalido!");
              return;
            }
             if (!txtVl2.matches("[0-9]+")){ //validando campo que nao pode ficar vazio
                JOptionPane.showMessageDialog(null, "Valor 2 invalido!");
              return;
            }
            soma = Integer.parseInt(txtVl1) +
                    Integer.parseInt(txtVl2); //convertendo texto para inteiro e somando
            JOptionPane.showMessageDialog(null, soma); //recebe o valor da soma
        }
    }
    
    
        
}
