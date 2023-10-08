package Service;

import model.Estatistica;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServiceEstatisticas implements LerArquivo<Estatistica> {
    @Override
    public List <Estatistica> ler() {
        String caminhoDoArquivo = "src/csv/campeonato-brasileiro-estatisticas-full.csv";
        List<Estatistica> estatisticas = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = reader.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] campos = linha.split(",");
                Estatistica estatistica = new Estatistica();
                estatistica.setPartidaId(campos[0].replace("\"", ""));
                estatistica.setRodada(campos[1].replace("\"", ""));
                estatistica.setClube(campos[2].replace("\"", ""));
                estatistica.setChutes(campos[3].replace("\"", ""));
                estatistica.setChutesNoAlvo(campos[4].replace("\"", ""));
                estatistica.setPosseDeBola(campos[5].replace("\"", ""));
                estatistica.setPasses(campos[6].replace("\"", ""));
                estatistica.setPrecisaoPasses(campos[7].replace("\"", ""));
                estatistica.setFaltas(campos[8].replace("\"", ""));
                estatistica.setCartaoAmarelo(campos[9].replace("\"", ""));
                estatistica.setCartaoVermelho(campos[10].replace("\"", ""));
                estatistica.setImpedimentos(campos[11].replace("\"", ""));
                estatistica.setEscanteios(campos[12].replace("\"", ""));

                estatisticas.add(estatistica);
            }
            return estatisticas;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao ler o arquivo!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}
