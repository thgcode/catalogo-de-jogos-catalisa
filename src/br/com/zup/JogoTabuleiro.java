package br.com.zup;

public class JogoTabuleiro extends Jogo {
    private int quantidadeDePecas;

    public JogoTabuleiro(String nome, int quantidadeDeJogadores, int horasDeJogo, int quantidadeDePecas) {
        super(TipoDeJogo.TABULEIRO, nome, quantidadeDeJogadores, horasDeJogo);
        this.quantidadeDePecas = quantidadeDePecas;
    }

    public int getQuantidadeDePecas() {
        return quantidadeDePecas;
    }

    @Override
    public String toString() {
        return super.toString() + "JogoTabuleiro{" +
                "quantidadeDePecas=" + quantidadeDePecas +
                '}';
    }
}