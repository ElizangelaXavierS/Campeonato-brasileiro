package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Partida {
    private  int id;
    private int rodada;
    private LocalDate data;
    private LocalTime hora;
    private String mandante;
    private String visitante;
    private String formacaoMandante;
    private String formacaoVisitante;
    private String tecnicoMandante;
    private String tecnicoVisitante;
    private String vencedor;
    private String arena;
    private String mandantePlacar;
    private String visitantePlacar;
    private String mandanteEstado;
    private String visitanteEstado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public String getMandante() {
        return mandante;
    }

    public void setMandante(String mandante) {
        this.mandante = mandante;
    }

    public String getVisitante() {
        return visitante;
    }

    public void setVisitante(String visitante) {
        this.visitante = visitante;
    }

    public String getFormacaoMandante() {
        return formacaoMandante;
    }

    public void setFormacaoMandante(String formacaoMandante) {
        this.formacaoMandante = formacaoMandante;
    }

    public String getFormacaoVisitante() {
        return formacaoVisitante;
    }

    public void setFormacaoVisitante(String formacaoVisitante) {
        this.formacaoVisitante = formacaoVisitante;
    }

    public String getTecnicoMandante() {
        return tecnicoMandante;
    }

    public void setTecnicoMandante(String tecnicoMandante) {
        this.tecnicoMandante = tecnicoMandante;
    }

    public String getTecnicoVisitante() {
        return tecnicoVisitante;
    }

    public void setTecnicoVisitante(String tecnicoVisitante) {
        this.tecnicoVisitante = tecnicoVisitante;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getArena() {
        return arena;
    }

    public void setArena(String arena) {
        this.arena = arena;
    }

    public String getMandantePlacar() {
        return mandantePlacar;
    }

    public void setMandantePlacar(String mandantePlacar) {
        this.mandantePlacar = mandantePlacar;
    }

    public String getVisitantePlacar() {
        return visitantePlacar;
    }

    public void setVisitantePlacar(String visitantePlacar) {
        this.visitantePlacar = visitantePlacar;
    }

    public String getMandanteEstado() {
        return mandanteEstado;
    }

    public void setMandanteEstado(String mandanteEstado) {
        this.mandanteEstado = mandanteEstado;
    }

    public String getVisitanteEstado() {
        return visitanteEstado;
    }

    public void setVisitanteEstado(String visitanteEstado) {
        this.visitanteEstado = visitanteEstado;
    }

    @Override
    public String toString() {
        return "Partida{" +
                "id=" + id +
                ", rodada=" + rodada +
                ", data=" + data +
                ", hora=" + hora +
                ", mandante='" + mandante + '\'' +
                ", visitante='" + visitante + '\'' +
                ", formacaoMandante='" + formacaoMandante + '\'' +
                ", formacaoVisitante='" + formacaoVisitante + '\'' +
                ", tecnicoMandante='" + tecnicoMandante + '\'' +
                ", tecnicoVisitante='" + tecnicoVisitante + '\'' +
                ", vencedor='" + vencedor + '\'' +
                ", arena='" + arena + '\'' +
                ", mandantePlacar='" + mandantePlacar + '\'' +
                ", visitantePlacar='" + visitantePlacar + '\'' +
                ", mandanteEstado='" + mandanteEstado + '\'' +
                ", visitanteEstado='" + visitanteEstado + '\'' +
                '}';
    }
}
