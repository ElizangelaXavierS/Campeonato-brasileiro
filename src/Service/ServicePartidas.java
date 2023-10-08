package Service;


import model.Partida;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class ServicePartidas implements LerArquivo<Partida>{
    @Override
    public List<Partida> ler() {
        String caminhoDoArquivo = "src/csv/campeonato-brasileiro-full.csv";
        List<Partida> partidas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = reader.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] campos = linha.split(",");
                Partida partida = new Partida();
                partida.setId(Integer.parseInt(campos[0].replace("\"", "")));
                partida.setRodada(Integer.parseInt(campos[1].replace("\"", "")));
                DateTimeFormatter formatoDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                String data = campos[2].replace("\"", "");
                String dataFormatada = String.format("%02d/%02d/%04d",
                        Integer.parseInt(data.split("/")[0]),
                        Integer.parseInt(data.split("/")[1]),
                        Integer.parseInt(data.split("/")[2]));
                partida.setData(LocalDate.parse(dataFormatada,formatoDate));
                DateTimeFormatter formatoTime = DateTimeFormatter.ofPattern("HH:mm");
                partida.setHora(LocalTime.parse(campos[3].replace("\"", ""), formatoTime));
                partida.setMandante(campos[4].replace("\"", ""));
                partida.setVisitante(campos[5].replace("\"", ""));
                partida.setFormacaoMandante(campos[6].replace("\"", ""));
                partida.setFormacaoVisitante(campos[7].replace("\"", ""));
                partida.setTecnicoMandante(campos[8].replace("\"", ""));
                partida.setTecnicoVisitante(campos[9].replace("\"", ""));
                partida.setVencedor(campos[10].replace("\"", ""));
                partida.setArena(campos[11].replace("\"", ""));
                partida.setMandantePlacar(campos[12].replace("\"", ""));
                partida.setVisitantePlacar(campos[13].replace("\"", ""));
                partida.setMandanteEstado(campos[14].replace("\"", ""));
                partida.setVisitanteEstado(campos[15].replace("\"", ""));

                partidas.add(partida);
            }
            return partidas;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao ler o arquivo!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
