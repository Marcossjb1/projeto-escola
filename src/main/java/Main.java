import entity.Professor;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      Professor professor = new Professor();
      //Aqui tu tem que criar um objeto aluno para conseguir chamar tua função

      int opcao;
      do{
        System.out.println("Escolha uma opçao:  ");
        System.out.println("1. Professor ");
        System.out.println("2. Aluno");
        System.out.println("3. Funcionario");
        System.out.println("4. Cardapio da escola");
        System.out.println("0. Sair");
        opcao = scanner.nextInt();
        switch (opcao){
          case 1:
            professor.menuProfessor(scanner);
            break;
          case 2:
//Aí aqui tu chama teu objeto com a função, tipo "aluno.menuAluno"
            break;
          case 3:
            System.out.println("Voce escolheu a opcao funcionario");
            //Todo:Criar uma função para o funcionário
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
      }while (opcao!= 0);
    }
}
