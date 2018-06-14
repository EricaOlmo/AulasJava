
package br.com.Erica;
//vai implementar os metodos do listner
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


public class MeuListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent ae) {
        JOptionPane.showConfirmDialog(null, "Olá, sou o Action Performed do Meu Listener!");
                
    }
    
    
}
