package entity;

import java.util.Scanner;

public class Professor extends Funcionario {

  public String materia;

  public Professor(String nome, String cargo, String cpf, int idade, Double salario) {
    super(nome, cargo, cpf, idade, salario);
  }

  public Professor() {
    super();

  }

  public String getMateria() {
    return materia;
  }

  public void setMateria(String materia) {
    this.materia = materia;
  }

  public void menuProfessor(Scanner scanner) {
    System.out.println("Opcao professor foi selecionada");
    System.out.println("Digite o nome do professor:");
    nome = scanner.next();

    System.out.println("Digite o nome da materia:");
    materia = scanner.next();

    System.out.println("Professor: " + nome);
    System.out.println("Matéria: " + materia);
  }
}
