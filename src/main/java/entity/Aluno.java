package entity;

import java.util.Scanner;

public class Aluno {

    public String nome;
    public String idade;
    public String cpf;
    public int matricula;
    public int nota1;
    public int nota2;

    public Aluno() {
    }
    public void menuAluno(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do aluno(a): ");
        nome = scanner.next();
        System.out.println("Digite o nome do aluno(a): ");
        String matricula = scanner.next();
        System.out.println("Digite a primeira nota do aluno(a): ");
        nota1 = scanner.nextInt();
        System.out.println("Digite a segunda nota do aluno(a): ");
        nota2 = scanner.nextInt();

        System.out.println("Olá, "+nome+" Seja bem-vindo.");
    }
    public double calcularMedia(double nota1, double nota2) {
        return (nota1 + nota2) / 2;
    }

}
