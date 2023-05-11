package src;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //TODO: CRIAR CLASSE ALUNO COM AS SEGUINTES VARIAVEIS(nome,idade,cpf,matricula,nota) -> Marcos
    //TODO: CRIAR CLASSE CronogramaAlimentarCantina(vocês escolhem as variaveis) e também criar uma função que ao chamar a mesma ela retorna a seguinte frase "HORA DO RANGO" -> Marcos

    CronogramaAlimentarCantina cantina = new CronogramaAlimentarCantina();
    Scanner scanner = new Scanner(System.in);

    System.out.print("energético: ");
    cantina.energetico = scanner.nextLine();

    System.out.print("refrigerante: ");
    cantina.refrigerante = scanner.nextLine();

    System.out.print("salgadinho: ");
    cantina.salgadinho = scanner.nextLine();

    System.out.print("bolacha: ");
    cantina.bolacha = scanner.nextLine();

    System.out.print("bala: ");
    cantina.bala = scanner.nextLine();

    System.out.print("chiclete: ");
    cantina.chiclete = scanner.nextLine();

    String resultado = cantina.verificarHoraDoRango();
    System.out.println(resultado);
  }
}
