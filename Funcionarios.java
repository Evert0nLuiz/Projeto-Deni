package org.evertonprojetos.projetodeni;

public class Funcionarios {
    private String id;
    private String nome;
    private String salario;

    public Funcionarios(String nome, String id, String salario)
    {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }
    public Funcionarios()
    {

    }

    public String getNome()
    {
        return nome;
    }
    public String getId() {return id;}
    public String getSalario(){return salario;}

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setSalario(String salario){
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", salario='" + salario + '\'' +
                '}';
    }


}
