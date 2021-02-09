package br.com.zup;

public class CriadorDeJogosDeVideoGame extends CriadorDeJogos {
    boolean online;

    public CriadorDeJogosDeVideoGame() {
        super();
    }

    public Jogo criar() {
        super.criar();

        System.out.println("Seu jogo vai ser online?");
        online = scanner.nextLine().equalsIgnoreCase("s");

        return new JogoVideoGame(nome, quantidadeDeJogadores, horasDeJogo, online);
    }
}
