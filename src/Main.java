import Service.ServiceCartoes;
import Service.ServiceEstatisticas;
import Service.ServiceGols;
import Service.ServicePartidas;
import model.Cartao;
import model.Estatistica;
import model.Gol;
import model.Partida;

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

    ServicePartidas servicePartidas =new ServicePartidas();
    List <Partida> partidas= servicePartidas.ler();
     partidas.forEach(System.out::println);

}}