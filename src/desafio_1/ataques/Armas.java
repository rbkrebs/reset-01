package desafio_1.ataques;

public class Armas {

    String nome;
    Integer intensidade;

    public Armas(String nome, Integer intensidade){

        this.nome = nome;
        this.intensidade = intensidade;

    }

    public Integer getIntensidade() {
        return intensidade;
    }
}