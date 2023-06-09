import entity.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Funcionario funcionario = new Funcionario();
        CardapioCantina cardapio = new CardapioCantina();
        Livro livro = new Livro();

        int opcao;
        do {
            System.out.println("Escolha uma opcao:  ");
            System.out.println("1. Professor ");
            System.out.println("2. Aluno");
            System.out.println("3. Funcionario");
            System.out.println("4. Cardapio da escola");
            System.out.println("5. Biblioteca da escola");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    professor.menuProfessor(scanner);
                    break;
                case 2:
                    aluno.menuAluno(scanner);
                    break;
                case 3:
                    System.out.println("Voce escolheu a opcao funcionario");
                    funcionario.menuFuncionario(scanner);
                    break;
                case 4:
                    System.out.println("Voce escolheu a opcao cardapio");
                    cardapio.menuCardapio();
                    break;
                case 5:
                    System.out.println("Voce escolheu a opcao biblioteca da escola");
                    livro.menuLivro(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando programa");
                    break;
                default:
                    System.out.println("opcao invalida, tente novamente");
                    break;
            }
        } while (opcao != 0);
    }
}
