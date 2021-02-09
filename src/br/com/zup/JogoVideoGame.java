package br.com.zup;

public class JogoVideoGame  extends Jogo {
    private boolean online;

    public JogoVideoGame(String nome, int quantidadeDeJogadores, int horasDeJogo, boolean online) {
        super(TipoDeJogo.VIDEOGAME, nome, quantidadeDeJogadores, horasDeJogo);
        this.online = online;
    }

    public boolean getOnline() {
        return online;
    }

    @Override
    public String toString() {
        return super.toString() + "JogoVideoGame{" +
                "online=" + online +
                '}';
    }
}
