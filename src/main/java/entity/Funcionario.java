package entity;

import java.util.Scanner;

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

  public void menuFuncionario(Scanner scanner) {
    System.out.println("Opcao funcionario foi selecionada");
    System.out.println("Digite seu nome:");
    nome = scanner.next();

    System.out.println("Digite o seu cargo, " + nome);
    cargo = scanner.next();

    System.out.println("Digite seu cpf:");
    cpf = scanner.next();
    validacaoCPF(cpf, scanner);

    System.out.println("Digite sua idade:");
    idade = scanner.nextInt();

    System.out.println("Digite seu salario:");
    salario = scanner.nextDouble();

    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
    System.out.println("CPF: " + cpf);
    System.out.println("Cargo: " + cargo);
    System.out.println("Salario: " + salario);

  }

  public static void validacaoCPF(String cpf, Scanner scanner) {

    boolean cpfValido = false;

    do {
      System.out.println("Digite seu CPF de forma correta, ele deve conter 11 digitos:");
      cpf = scanner.next();

      cpf = cpf.replaceAll("\\D", "");

      if (cpf.length() == 11) {
        cpfValido = true;
      } else {
        System.out.println("CPF invalido. Tente novamente.");
      }
    } while (!cpfValido);

    System.out.println("CPF valido: " + cpf);
  }
}
