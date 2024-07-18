package poo;

import java.util.Scanner;

public class AparelhoTelefonico {
    public void ligar() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número de telefone: ");
        String numero = sc.nextLine();

        System.out.println("Ligando para o número " + numero + " !");
    }
    public void atender() {
        System.out.println("Atendendo chamada!");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
}
