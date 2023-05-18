
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);
      int opcao;
      do{
        System.out.println("Escolha uma opção:  ");
        System.out.println("1. Professor ");
        System.out.println("2. Aluno");
        System.out.println("3. Funcionário");
        System.out.println("4. Cardápio da escola");
        System.out.println("0. Sair");
        opcao = scanner.nextInt();
        switch (opcao){
          case 1:
            System.out.println("Você escolheu a opção professor");
            break;
          case 2:
            System.out.println("Você escolheu a opção aluno");
            break;
          case 3:
            System.out.println("Você escolheu a opção funcionario");
            break;
          case 4:
            System.out.println("Você escolheu a opção cardapio");
            break;
          case 0:
            System.out.println("Encerrando programa");
            break;
          default:
            System.out.println("opção inválida, tente novamente");
            break;
        }
      }while (opcao!= 0);
    }
}
