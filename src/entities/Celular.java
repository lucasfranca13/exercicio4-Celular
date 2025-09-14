package entities;

import java.util.List;

public class Celular {
    public int codigo;
    public String modelo;
    public String marca;
    public List<Jogo> jogos;
    public Tela tela;
    public Processador processador;
    public Memoria memoria;


    public Celular() {
    }

    public Celular(int codigo, String modelo, String marca, List<Jogo> jogos, Tela tela, Processador processador, Memoria memoria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.jogos = jogos;
        this.tela = tela;
        this.processador = processador;
        this.memoria = memoria;
    }

    public Celular(int codigo, String modelo, String marca, Tela tela, Processador processador, Memoria memoria) {
        this.codigo = codigo;
        this.modelo = modelo;
        this.marca = marca;
        this.tela = tela;
        this.processador = processador;
        this.memoria = memoria;
    }

    public void ligar(){
        System.out.println("O celular está ligado");
    }

    public void desligar(){
        System.out.println("O celular está desligado");
    }

    public void chamar(){
        System.out.println("O celular está chamando");
    }

    @Override
    public String toString() {
        return "Celular" +
                "\ncodigo: " + codigo +
                "\nmodelo: '" + modelo + '\'' +
                "\nmarca: '" + marca + '\'' +
                "\njogos: " + jogos +
                "\ntela: " + tela  +
                "\nprocessador: " + processador +
                "\nmemoria: " + memoria;
    }
}
