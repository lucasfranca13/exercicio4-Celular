import entities.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // criando tela
        Tela tela = new Tela(1, "Tela FHD", "LCD", 5.0);

        // criando processador
        Processador processador = new Processador(1, "Snapdragon","Processador de entrada" , 270.00);

        // criando Memoria
        Memoria memoria = new Memoria(1, "Memoria RAM", "RAM", 250.00);

        // criando celular
        Celular celular = new Celular(1, "Galaxy M35", "Samsung", tela, processador, memoria);

        // criando um jogo
        Jogo jogo = new Jogo(1, "Mario Bros", "Plataforma Lateral", 1);
        celular.jogos = new ArrayList<>();
        celular.jogos.add(jogo); //Adicona jogo no celular

        System.out.println();
        System.out.println(celular);
    }
}
