package br.com.gabriel.objeto;

public enum TipoAvaliacao {

    PROVA("Avaliação Individual"),
    SEMINARIO("Seminario"),
    TRABALHO("Trabalho");

    public String nome;

    private TipoAvaliacao(String TipoAvaliacao) {
        this.nome = TipoAvaliacao;
    }

    public String getTipoAvaliacao() {
        return nome;
    }
}