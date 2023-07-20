package org.evertonprojetos.projetodeni.telas;

import org.evertonprojetos.projetodeni.ControladorDeFuncionarios;
import org.evertonprojetos.projetodeni.Funcionarios;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal  extends JFrame{

    ControladorDeFuncionarios controladorDeFuncionarios = new ControladorDeFuncionarios();
    Funcionarios funcionario = new Funcionarios();
    private JTextField textSalario;
    private JTextField textNumero;
    private JTextField textNome;
    private JButton btnSalvar;
    private JButton btnSaida;
    public JPanel painelPrincipal;
    private JButton mostrarTodosOsFuncionáriosButton;
    private JButton btnBuscar;

    public TelaPrincipal() {



    btnSaida.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    });
    btnSalvar.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {

            funcionario.setNome(textNome.getText());
            funcionario.setId(textNumero.getText());
            funcionario.setSalario(textSalario.getText());


            if(controladorDeFuncionarios.salvar(funcionario)){

                JOptionPane.showMessageDialog(null,"Funcionário cadastrado com sucesso");
                textNome.setText("");
                textNumero.setText("");
                textSalario.setText("");
                textNome.requestFocus();

            }else{
                JOptionPane.showMessageDialog(null,"Fúncionario não foi cadastrado");
            }



        }
    });


        btnBuscar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!textNumero.getText().equals("")) {
                   funcionario = controladorDeFuncionarios.buscarFuncionario(textNumero.getText());
                   if(funcionario != null){
                       textNome.setText(funcionario.getNome());
                       textNumero.setText(funcionario.getId());
                       textSalario.setText(funcionario.getSalario());
                   }
                   else {JOptionPane.showMessageDialog(null,"Funcionário sem cadastro");}
                }else{JOptionPane.showMessageDialog(null,"Erro");}


            }
        });
    }
}
