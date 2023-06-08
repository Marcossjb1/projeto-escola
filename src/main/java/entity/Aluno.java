package entity;

import static validacao.Validadores.validacaoCPF;
import static validacao.Validadores.validacaoMatricula;

import java.util.Scanner;

public class Aluno {
  public String nome;
  public int idade;
  public String cpf;
  public String matricula;
  public int nota1;
  public int nota2;

  public Aluno() {
  }

  public void menuAluno(Scanner scanner) {

    System.out.println("Digite o nome do aluno(a): ");
    nome = scanner.next();
    System.out.println("Digite a idade do aluno: ");
    idade = scanner.nextInt();
    System.out.println("Digite o Cpf do aluno: ");
    validacaoCPF(cpf, scanner);
    System.out.println("Digite a matricula do aluno: ");
    validacaoMatricula(matricula,scanner);
    System.out.println("Digite a primeira nota do aluno(a): ");
    nota1 = scanner.nextInt();
    System.out.println("Digite a segunda nota do aluno(a): ");
    nota2 = scanner.nextInt();

    System.out.println("Olá, " + nome + " Seja bem-vindo.");

    double media = calcularMedia(nota1, nota2);
    System.out.println("A sua media e " + media);
  }

  public double calcularMedia(double nota1, double nota2) {
    return (nota1 + nota2) / 2;
  }

}
