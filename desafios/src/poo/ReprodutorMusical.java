package poo;

import java.util.Scanner;

public class ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música!");
    }
    public void pausa() {
        System.out.println("Música pausada!");
    }
    public void selecionarMusica() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome da música: ");
        String musica = sc.nextLine();

        System.out.println("Tocando a música " + musica + " !");
    }
}
