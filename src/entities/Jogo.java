package entities;

public class Jogo {
    public int codigo;
    public String nome;
    public String tipo;
    public double tamanho;

    public Jogo() {
    }

    public Jogo(int codigo, String nome, String tipo, double tamanho) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipo = tipo;
        this.tamanho = tamanho;
    }
    public void Iniciar(){
        System.out.println("O jogo foi iniciado");
    }
    public void Encerrar(){
        System.out.println("O jogo foi encerrado");
    }

    @Override
    public String toString() {
        return "Jogo: " +
                + codigo +
                ", " + nome +
                ", " + tipo +
                ", " + tamanho;
    }
}
