package entity;

public class Aluno {

  public String nome;
  public String idade;
  public String cpf;
  public int matricula;
  public int nota1;
  public int nota2;

  public Aluno(String nome, String idade, String cpf, int matricula, int nota1, int nota2) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.matricula = matricula;
    this.nota1 = nota1;
    this.nota2 = nota2;
  }

  public double calcularMedia() {
    return (nota1+nota2)/2;
  }
}
