package src.entity;

public class Aluno {

  public String nome;
  public String idade;
  public String cpf;
  public int matricula;
  public int nota;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getIdade() {
    return idade;
  }

  public void setIdade(String idade) {
    this.idade = idade;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public int getNota() {
    return nota;
  }

  public void setNota(int nota) {
    this.nota = nota;
  }

  public Aluno(String nome, String idade, String cpf, int matricula, int nota) {
    this.nome = nome;
    this.idade = idade;
    this.cpf = cpf;
    this.matricula = matricula;
    this.nota = nota;
  }
}
