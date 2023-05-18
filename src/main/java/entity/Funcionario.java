package entity;

public class Funcionario {
    public String nome;
    public String cargo;
    public String cpf;
    public int idade;
    public Double salario;

    public Funcionario(String nome, String cargo, String cpf, int idade, Double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public Funcionario() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
