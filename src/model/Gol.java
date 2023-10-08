package model;

public class Gol {
    private String partidaId;
    private int rodada;
    private String clube;
    private String atleta;
    private String minuto;
    private String tipoDeGol;

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

    public String getAtleta() {
        return atleta;
    }

    public void setAtleta(String atleta) {
        this.atleta = atleta;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getTipoDeGol() {
        return tipoDeGol;
    }

    public void setTipoDeGol(String tipoDeGol) {
        this.tipoDeGol = tipoDeGol;
    }

    @Override
    public String toString() {
        return "Gol{" +
                "partidaId='" + partidaId + '\'' +
                ", rodada=" + rodada +
                ", clube='" + clube + '\'' +
                ", atleta='" + atleta + '\'' +
                ", minuto='" + minuto + '\'' +
                ", tipoDeGol='" + tipoDeGol + '\'' +
                '}';
    }
}
