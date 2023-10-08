package Service;


import model.Gol;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ServiceGols implements LerArquivo<Gol>{
    @Override
    public List<Gol> ler() {
        String caminhoDoArquivo = "src/csv/campeonato-brasileiro-gols.csv";
        List<Gol> gols = new ArrayList<>();
        
        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = reader.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] campos = linha.split(",");
                Gol gol = new Gol();
                gol.setPartidaId(campos[0].replace("\"", ""));
                gol.setRodada(Integer.parseInt(campos[1].replace("\"", "")));
                gol.setClube(campos[2].replace("\"", ""));
                gol.setAtleta(campos[3].replace("\"", ""));
                gol.setMinuto(campos[4].replace("\"", ""));
                gol.setTipoDeGol(campos[5].replace("\"", ""));

                gols.add(gol);
            }
            return gols;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao ler o arquivo!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
