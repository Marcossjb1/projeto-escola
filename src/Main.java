package src;

import java.util.Scanner;
import src.entity.CronogramaAlimentarCantina;

public class Main {

  public static void main(String[] args) {

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

    //TODO: CRIAR DOIS ALUNOS, UM TEM COMO HABILIDADE EM JAVA E O OUTRO EM LOGICA DE PROGRAMACAO, IMPRIMIR DADOS NA TELA -> Marcos
    //TODO: CRIAR UM PROFESSOR E ATRIBUIR OS SEUS DEVIDOS DADOS -> Maycon
    //TODO: RODAR ESSA APLICAÇÃO EM MAVEN -> Gui

  }
}
