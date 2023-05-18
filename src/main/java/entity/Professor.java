package entity;

public class Professor extends Funcionario {
    public String materia;

    public String getMateria() {
        return materia;
    }

    public Professor(String nome, String cargo, String cpf, int idade, Double salario, String materia) {
        super(nome, cargo, cpf, idade, salario);
        this.materia = materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
