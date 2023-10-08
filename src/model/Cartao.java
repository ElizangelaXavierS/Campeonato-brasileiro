package model;


public class Cartao {
    private String partidaId;
    private int rodada;
    private String clube;
    private String cartao;
    private String atleta;
    private String numCamisa;
    private String posicao;
    private String minuto;

    public String getPartidaId() {
        return partidaId;
    }

    public void setPartidaId(String partidaId) {
        this.partidaId = partidaId;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getCartao() {
        return cartao;
    }

    public void setCartao(String cartao) {
        this.cartao = cartao;
    }

    public String getAtleta() {
        return atleta;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    public String getNumCamisa() {
        return numCamisa;
    }

    public void setNumCamisa(String numCamisa) {
        this.numCamisa = numCamisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    @Override
    public String toString() {
        return "Cartao{" +
                "partida_id='" + partidaId + '\'' +
                ", rodada=" + rodada +
                ", clube='" + clube + '\'' +
                ", atleta='" + atleta + '\'' +
                ", num_camisa=" + numCamisa +
                ", posicao='" + posicao + '\'' +
                ", minuto=" + minuto +
                '}';
    }
}
