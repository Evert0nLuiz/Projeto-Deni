package org.evertonprojetos.projetodeni.telas;

import javax.swing.*;
import java.awt.event.*;

public class dlgMostraFuncionarios extends JDialog {
    private JPanel contentPane;
    private JButton buttonSair;
    private JTable tabelaFuncionarios;

    public dlgMostraFuncionarios() {
        setContentPane(contentPane);
        setModal(true);


        buttonSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
    }


    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        dlgMostraFuncionarios dialog = new dlgMostraFuncionarios();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);


    }
}
