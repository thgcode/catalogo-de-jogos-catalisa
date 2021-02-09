package br.com.zup;

public class JogoDeRua  extends Jogo {
    private boolean perigoso;
    private TipoDeJogoDeRua tipoDeJogoDeRua;

    public JogoDeRua(String nome, int quantidadeDeJogadores, int horasDeJogo, TipoDeJogoDeRua tipoDeJogoDeRua, boolean perigoso) {
        super(TipoDeJogo.RUA, nome, quantidadeDeJogadores, horasDeJogo);
        this.tipoDeJogoDeRua = tipoDeJogoDeRua;
        this.perigoso = perigoso;
    }

    public boolean getPerigoso() {
        return perigoso;
    }

    public TipoDeJogoDeRua getTipoDeJogoDeRua() {
        return tipoDeJogoDeRua;
    }

    @Override
    public String toString() {
        return super.toString() + "JogoDeRua{" +
                "perigoso=" + perigoso +
                ", tipoDeJogoDeRua=" + tipoDeJogoDeRua +
                '}';
    }
}