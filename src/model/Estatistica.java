package model;

public class Estatistica {
    private String partidaId;
    private String rodada;
    private String clube;
    private String chutes;
    private String chutesNoAlvo;
    private String posseDeBola;
    private String passes;
    private String precisaoPasses;
    private String faltas;
    private String cartao;

    public String getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(String partidaId) {
        this.partidaId = partidaId;
    }

    public String getRodada() {
        return rodada;
    }

    public void setRodada(String rodada) {
        this.rodada = rodada;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getChutes() {
        return chutes;
    }

    public void setChutes(String chutes) {
        this.chutes = chutes;
    }

    public String getChutesNoAlvo() {
        return chutesNoAlvo;
    }

    public void setChutesNoAlvo(String chutesNoAlvo) {
        this.chutesNoAlvo = chutesNoAlvo;
    }

    public String getPosseDeBola() {
        return posseDeBola;
    }

    public void setPosseDeBola(String posseDeBola) {
        this.posseDeBola = posseDeBola;
    }

    public String getPasses() {
        return passes;
    }

    public void setPasses(String passes) {
        this.passes = passes;
    }

    public String getPrecisaoPasses() {
        return precisaoPasses;
    }

    public void setPrecisaoPasses(String precisaoPasses) {
        this.precisaoPasses = precisaoPasses;
    }

    public String getFaltas() {
        return faltas;
    }

    public void setFaltas(String faltas) {
        this.faltas = faltas;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    @Override
    public String toString() {
        return "Estatistica{" +
                "partidaId='" + partidaId + '\'' +
                ", rodada=" + rodada +
                ", clube='" + clube + '\'' +
                ", chutes=" + chutes +
                ", chutesNoAlvo=" + chutesNoAlvo +
                ", posseDeBola=" + posseDeBola +
                ", passes=" + passes +
                ", precisaoPasses=" + precisaoPasses +
                ", faltas=" + faltas +
                ", cartao=" + cartao +
                '}';
    }
}
