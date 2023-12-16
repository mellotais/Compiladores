package CompiladorCompleto;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Importador {

	public int[][] getTabela() {
        int[][] tabela = null;
        try {
            File arq = new File("arquivo.txt");
            List<Dado> dados = new ArrayList<Dado>();

            
            Scanner ler = new Scanner(arq); 
            
            while (ler.hasNext()) {                
                dados.add(new Dado(ler.nextInt(), ler.nextInt()));
            }
            
            tabela = new int[dados.size()][2];
            
            for (int i = 0; i < dados.size(); i++) {
                tabela[i][0] = dados.get(i).valor1;
                tabela[i][1] = dados.get(i).valor2;
            }
     

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        return tabela;
    }


    
    
}
