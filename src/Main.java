import leitor.LerCartoes;
import leitor.LerEstatisticas;
import leitor.LerGols;
import leitor.LerPartidas;
import model.Cartao;
import model.Estatistica;
import model.Gol;
import model.Partida;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        LerEstatisticas serviceEstatisticas = new LerEstatisticas();
        List<Estatistica> estatisticas = serviceEstatisticas.ler();

        LerCartoes serviceCartoes = new LerCartoes();
        List<Cartao> cartaos = serviceCartoes.ler();

        LerGols serviceGols = new LerGols();
        List<Gol> gols = serviceGols.ler();

        LerPartidas servicePartidas = new LerPartidas();
        List<Partida> partidas = servicePartidas.ler();

        buscarTimeQueMaisVenceu2008(partidas);
        estadoComMenosJogosDe2003A2022(partidas);
        jogadoQueFezMaisGols(gols);
        jogadoQueFezMaisGolsDePenaltis(gols);
        jogadoQueFezMaisGolsContras(gols);

    }

    private static void buscarTimeQueMaisVenceu2008(List<Partida> partidas) {
        List<Partida> partidasDe2008 = partidas.stream().filter(p -> p.getData().getYear() == 2008).toList();

        Map<String, Long> vencedoresContagem = partidasDe2008.stream()
                .filter(p -> p.getVencedor() != null && !p.getVencedor().isEmpty())
                .collect(Collectors.groupingBy(Partida::getVencedor, Collectors.counting()));

        Optional<Map.Entry<String, Long>> timeMaisVitorioso = vencedoresContagem.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (timeMaisVitorioso.isPresent()) {
            System.out.println("Time mais vitorioso em 2008: " + timeMaisVitorioso.get().getKey() +
                    " com " + timeMaisVitorioso.get().getValue() + " vitórias.");
        } else {
            System.out.println("Nenhum time venceu partidas em 2008.");
        }
    }

    private static void estadoComMenosJogosDe2003A2022(List<Partida> partidas) {

        List<Partida> partidasNoPeriodo = partidas.stream()
                .filter(p -> p.getData().getYear() >= 2003 && p.getData().getYear() <= 2022)
                .toList();

        Map<String, Long> mandanteContagem = partidasNoPeriodo.stream()
                .collect(Collectors.groupingBy(Partida::getMandanteEstado, Collectors.counting()));


        Optional<Map.Entry<String, Long>> estadoMenosJogos = mandanteContagem.entrySet().stream()
                .min(Map.Entry.comparingByValue());

        if (estadoMenosJogos.isPresent()) {
            System.out.println("O estado com menos jogos entre 2003 e 2022 é: " +
                    estadoMenosJogos.get().getKey() + " com " + estadoMenosJogos.get().getValue() + " jogos.");
        } else {
            System.out.println("Nenhum estado teve jogos entre 2003 e 2022.");
        }
    }

    private static void jogadoQueFezMaisGols(List<Gol> gols) {
        Map<String, Long> contagemGolsPorJogador = gols.stream()
                .collect(Collectors.groupingBy(Gol::getAtleta, Collectors.counting()));

        Optional<Map.Entry<String, Long>> jogadorMaisGols = contagemGolsPorJogador.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (jogadorMaisGols.isPresent()) {
            System.out.println("O jogador que mais fez gols é: " +
                    jogadorMaisGols.get().getKey() + " com " + jogadorMaisGols.get().getValue() + " gols.");
        } else {
            System.out.println("Nenhum jogador fez gols.");
        }
    }

    private static void jogadoQueFezMaisGolsDePenaltis(List<Gol> gols) {
        List<Gol> golsDePenalti = gols.stream()
                .filter(gol -> "Penalty".equalsIgnoreCase(gol.getTipoDeGol()))
                .toList();

        Map<String, Long> contagemGolsPenaltiPorJogador = golsDePenalti.stream()
                .collect(Collectors.groupingBy(Gol::getAtleta, Collectors.counting()));

        Optional<Map.Entry<String, Long>> jogadorMaisGolsPenalti = contagemGolsPenaltiPorJogador.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (jogadorMaisGolsPenalti.isPresent()) {
            System.out.println("O jogador que mais fez gols de pênaltis é: " +
                    jogadorMaisGolsPenalti.get().getKey() + " com " + jogadorMaisGolsPenalti.get().getValue() + " gols.");
        } else {
            System.out.println("Nenhum jogador fez gols de pênaltis.");
        }
    }

    private static void jogadoQueFezMaisGolsContras(List<Gol> gols) {
        Map<String, Long> contagemGolsContrasPorJogador = gols.stream()
                .filter(gol ->"Gol Contra".equalsIgnoreCase(gol.getTipoDeGol()))
                .collect(Collectors.groupingBy(Gol::getAtleta, Collectors.counting()));

        Optional<Map.Entry<String, Long>> jogadorMaisGolsContras = contagemGolsContrasPorJogador.entrySet().stream()
                .max(Map.Entry.comparingByValue());

        if (jogadorMaisGolsContras.isPresent()) {
            System.out.println("O jogador que mais fez gols contras é: " +
                    jogadorMaisGolsContras.get().getKey() + " com " + jogadorMaisGolsContras.get().getValue() + " gols.");
        } else {
            System.out.println("Nenhum jogador fez gols contras.");
        }
    }
}