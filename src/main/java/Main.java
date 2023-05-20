
import entity.Funcionario;
import entity.Professor;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    Professor professor = new Professor();
    Funcionario funcionario = new Funcionario();

    int opcao;
    do {
      System.out.println(":::::::::::::::::::::::::::::");
      System.out.println("Escolha uma opcao:  ");
      System.out.println(":::::::::::::::::::::::::::::");
      System.out.println("1. Professor ");
      System.out.println("2. Aluno");
      System.out.println("3. Funcionario");
      System.out.println("4. Cardapio da escola");
      System.out.println("0. Sair");
      opcao = scanner.nextInt();
      switch (opcao) {
        case 1:
          professor.menuProfessor(scanner);
          break;
        case 2:
          //TODO:Criar uma função na classe aluno onde vai vai pedir os dados do mesmo e retornar a informações no console(pode calcular a média) -> Maycon
          //TODO:A função tem que ser chamada aqui dentro desse caso como foi chamada a função do menu professor no case 1 -> Maycon
          break;
        case 3:
          funcionario.menuFuncionario(scanner);
          break;
        case 4:
          System.out.println("Voce escolheu a opcao cardapio");
          //Todo:Criar uma função para o cardápio(peça para o usuário o cardápio do dia) -> Marcos
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
