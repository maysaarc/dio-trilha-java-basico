package poo;

import java.util.Scanner;

public class NavegadorInternet {
    public void exibirPagina() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a url: ");
        String url = sc.nextLine();

        System.out.println("Exibindo pádina da url " + url + " !");
    }
    public void adicionarNovaAba() {
        System.out.println("Nova aba!");
    }
    public void atualizarPagina() {
        System.out.println("Página atualizada!");
    }
}
