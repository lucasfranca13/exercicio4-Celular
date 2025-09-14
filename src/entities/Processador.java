package entities;

public class Processador {
    public int codigo;
    public String descricao;
    public String tipo;
    public double velocidade;

    public Processador() {
    }

    public Processador(int codigo, String descricao, String tipo, double velocidade) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tipo = tipo;
        this.velocidade = velocidade;
    }

    public void Alocar(){
        System.out.println("O processador foi alocado");
    }
    public void Desalocar(){
        System.out.println("O processador foi desalocado");
    }

    @Override
    public String toString() {
        return descricao;
    }
}
