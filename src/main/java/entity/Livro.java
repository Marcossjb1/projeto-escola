package entity;

import java.util.Scanner;

public class Livro {

    public String titulo;
    public String autor;
    public String genero;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void menuLivro(Scanner scanner){
        System.out.println("Digite o nome do livro: ");
        Scanner scannerTitulo = new Scanner(System.in);
        titulo = scannerTitulo.nextLine();
        System.out.println("Digite o genero do livro: ");
        genero = scanner.next();
        System.out.println("Digite o autor do livro: ");
        autor = scanner.next();

        System.out.println("O livro "+titulo+" com o genero "+genero+" foi escrito por "+autor);
    }
}
