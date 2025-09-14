package entities;

public class Memoria {
    public int codigo;
    public String descricao;
    public String tipo;
    public double capacidade;

    public Memoria() {
    }

    public Memoria(int codigo, String descricao, String tipo, double capacidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }

    public void Alocar(){
        System.out.println("A memória foi alocado");
    }

    public void Desalocar(){
        System.out.println("A memória foi alocado");
    }

    @Override
    public String toString() {
        return descricao;
    }
}
