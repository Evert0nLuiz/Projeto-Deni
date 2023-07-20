package org.evertonprojetos.projetodeni;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class ControladorDeFuncionarios {

   private final ArrayList<Funcionarios> funcionarios = new ArrayList<>();

   public boolean salvar (Funcionarios funcionario)
   {

      if(!funcionario.getNome().equals("") && !funcionario.getSalario().equals("") && !funcionario.getId().equals("")){
         funcionarios.add(funcionario);
         return true;
      }else{
         return false;
      }

   }

   public ArrayList<Funcionarios> retornarTodos()
   {
      return funcionarios;
   }


   public Funcionarios buscarFuncionario(String id) {

      Funcionarios funcionarioBuscar;
      funcionarioBuscar = null;
      for (int i = 0; i < funcionarios.size(); i++
      ) {
         if (funcionarios.get(i).getId().equals(id)) {
            funcionarioBuscar = funcionarios.get(i);
            break;
         } else {
            return funcionarioBuscar;
         }
      }
      return funcionarioBuscar;
   }
}
