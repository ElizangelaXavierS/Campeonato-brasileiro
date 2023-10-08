package leitor;

import model.Cartao;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerCartoes implements LerArquivo<Cartao> {

    @Override
    public List<Cartao> ler() {
        String caminhoDoArquivo = "src/csv/campeonato-brasileiro-cartoes.csv";
        List<Cartao> cartaos = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = reader.readLine()) != null) {
                if (primeiraLinha) {
                    primeiraLinha = false;
                    continue;
                }

                String[] campos = linha.split(",");
                Cartao cartao = new Cartao();
                cartao.setPartidaId(campos[0].replace("\"", ""));
                cartao.setRodada(Integer.parseInt(campos[0].replace("\"", "")));
                cartao.setClube(campos[2].replace("\"", ""));
                cartao.setCartao(campos[3].replace("\"", ""));
                cartao.setAtleta(campos[4].replace("\"", ""));
                cartao.setNumCamisa(campos[5].replace("\"", ""));
                cartao.setPosicao(campos[6].replace("\"", ""));
                cartao.setMinuto(campos[7].replace("\"", ""));

                cartaos.add(cartao);
            }
            return cartaos;
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Erro ao ler o arquivo!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
