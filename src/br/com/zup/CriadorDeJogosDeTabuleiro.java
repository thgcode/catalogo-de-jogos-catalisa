package br.com.zup;

public class CriadorDeJogosDeTabuleiro extends CriadorDeJogos {
    int quantidadeDePecas;

    public CriadorDeJogosDeTabuleiro() {
        super();
    }

    public Jogo criar() {
        super.criar();

        System.out.println("Qual a quantidade de peças?");
        quantidadeDePecas = Integer.parseInt(scanner.nextLine());

        return new JogoTabuleiro(nome, quantidadeDeJogadores, horasDeJogo, quantidadeDePecas);
    }
}
