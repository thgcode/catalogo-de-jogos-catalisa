package br.com.zup;

public class Jogo {
    private TipoDeJogo tipoDeJogo;
    private String nome;
    private int quantidadeDeJogadores;
    private int horasDeJogo;

    public Jogo(TipoDeJogo tipoDeJogo, String nome, int quantidadeDeJogadores, int horasDeJogo) {
        this.tipoDeJogo = tipoDeJogo;
        this.nome = nome;
        this.quantidadeDeJogadores = quantidadeDeJogadores;
        this.horasDeJogo = horasDeJogo;
    }

    public TipoDeJogo getTipoDeJogo() {
        return tipoDeJogo;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidadeDeJogadores() {
        return quantidadeDeJogadores;
    }

    public int getHorasDeJogo() {
        return horasDeJogo;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "tipoDeJogo=" + tipoDeJogo +
                ", nome='" + nome + '\'' +
                ", quantidadeDeJogadores=" + quantidadeDeJogadores +
                ", horasDeJogo=" + horasDeJogo +
                '}';
    }
}