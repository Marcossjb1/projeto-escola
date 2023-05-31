package validacao;

import java.util.Scanner;

public class Validadores {

  public static void validacaoCPF(String cpf, Scanner scanner) {

    boolean cpfValido = false;

    do {
      System.out.println("Digite seu CPF de forma correta, ele deve conter 11 digitos:");

      cpf = scanner.next();

      cpf = cpf.replaceAll("\\D", "");

      if (cpf.length() == 11) {
        cpfValido = true;
      } else {
        System.out.println("CPF invalido. Tente novamente.");
      }
    } while (!cpfValido);

    System.out.println("CPF valido: " + cpf);
  }

  public static void validacaoMatricula(String matricula, Scanner scanner) {

    boolean matriculaValida = false;

    do {
      System.out.println("Digite sua matricula de forma correta, ela deve conter 8 digitos:");

      matricula = scanner.next();

      matricula = matricula.replaceAll("\\D", "");

      if (matricula.length() == 8) {
        matriculaValida = true;
      } else {
        System.out.println("Matricula invalida. Tente novamente.");
      }
    } while (!matriculaValida);

    System.out.println("Matricula valida: " + matricula);
  }
}
