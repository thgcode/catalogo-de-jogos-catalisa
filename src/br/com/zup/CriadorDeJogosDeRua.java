package br.com.zup;

public class CriadorDeJogosDeRua extends CriadorDeJogos {
    TipoDeJogoDeRua tipoDeJogoDeRua;
    boolean perigoso;

    public CriadorDeJogosDeRua() {
        super();
    }

    public Jogo criar() {
        super().criar();

        System.out.println("Esse jogo de rua é perigoso?");
        perigoso = scanner.nextLine().equalsIgnoreCase("s");

        System.out.println("Qual o tipo de jogo de rua você desjea?");

        for (TipoDeJogoDeRua tipoDeJogo: TipoDeJogoDeRua.values()) {
            System.out.println(tipoDeJogo.name());
        }

        String tipo = scanner.nextLine();
        tipoDeJogoDeRua = TipoDeJogoDeRua.valueOf(tipo);

        return new JogoDeRua(nome, quantidadeDeJogadores, horasDeJogo, tipoDeJogoDeRua, perigoso);
    }
}
