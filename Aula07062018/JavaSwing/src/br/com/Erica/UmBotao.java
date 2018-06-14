/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Erica;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Erica
 */
public class UmBotao extends JFrame implements ActionListener {

    public UmBotao() throws HeadlessException {
        super ("Um botão");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(400, 200);
        JButton btn = new JButton("Botao");
        btn.addActionListener(this);
        this.add(btn);
        this.setVisible(true);
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        MinhaTela m = new MinhaTela();
        m.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }
    
}
