package desafio_1.ataques;

public class Magia {

    String nome;
    Integer intensidade;
    Integer custoMana;

    public Magia(String nome, Integer intesidade, Integer custoMana){

        this.nome = nome;
        this.intensidade = intesidade;
        this.custoMana = custoMana;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIntensidade() {
        return intensidade;
    }

    public Integer getCustoMana() {
        return custoMana;
    }
}