package br.com.zup;

import java.util.Scanner;

public class CriadorDeJogos {
    String nome;
    int quantidadeDeJogadores;
    int horasDeJogo;
    Scanner scanner;

    public CriadorDeJogos() {
        scanner = new Scanner(System.in);
    }

    public Jogo criar() {
        System.out.println("Qual o nome do jogo?");
        nome = scanner.nextLine();

        System.out.println("Qual a quantidade de jogadores?");
        quantidadeDeJogadores = Integer.parseInt(scanner.nextLine());

        System.out.println("Quantas horas o jogo tem?");
        horasDeJogo = Integer.parseInt(scanner.nextLine());

        return null; // Objeto tem que ser construído pela classe filha
    }

    public static CriadorDeJogos pegarCriador(String tipoDeJogo)throws Exception  {
        if (tipoDeJogo.equalsIgnoreCase("tabuleiro")) {
            return new CriadorDeJogosDeTabuleiro();
        } else if (tipoDeJogo.equalsIgnoreCase("videogame")) {
            return new CriadorDeJogosDeVideoGame();
        } else if (tipoDeJogo.equalsIgnoreCase("rua")) {
            return new CriadorDeJogosDeRua();
        }

        throw new Exception("Tipo de jogo não disponível");
    }
}
