package br.com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sistema {
    List <Jogo> jogos;
    private Scanner scanner;

    public Sistema() {
        jogos = new ArrayList <>();
        scanner = new Scanner(System.in);
    }

    public void mostrarSistema() {
        boolean continuar = true;

        while (continuar) {
            System.out.println("Qual tipo de jogo você deseja cadastrar?");
            String tipoDeJogo = scanner.nextLine();

            try {
                jogos.add(CriadorDeJogos.pegarCriador(tipoDeJogo).criar());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("Os jogos cadastrados até agora foram:");
            System.out.println(jogos);

            System.out.println("Deseja cadastrar outro jogo?");
            continuar = scanner.nextLine().equalsIgnoreCase("sim");
        }
        ;
    }
}