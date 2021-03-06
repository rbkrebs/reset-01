package personagens;


import ataques.PoderFerramenta;

public abstract class Personagem {

    private String nome;
    private Double vida;
    private Double ataque;
    private Double defesa;
    private static int numeroPersonagens = 0;


    public Personagem(){

    }

    public Personagem(String nome, Double vida, Double ataque, Double defesa) {
        this.nome = nome;
        this.vida = vida;
        this.ataque = ataque;
        this.defesa = defesa;
        numeroPersonagens++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getVida() {
        return vida;
    }

    public void setVida(Double vida) {
        this.vida = vida;
    }

    public Double getAtaque() {
        return ataque;
    }

    public void setAtaque(Double ataque) {
        this.ataque = ataque;
    }

    public Double getDefesa() {
        return defesa;
    }

    public void setDefesa(Double defesa) {
        this.defesa = defesa;
    }

    public String atacar(Personagem atacado, PoderFerramenta poderFerramenta){


        Double poderDeAtaque = poderFerramenta.getIntensidade() * this.getAtaque();
        Double dano = verificarDano(poderDeAtaque, atacado.getDefesa());
        atualizaVida(atacado, dano);

        if (atacado.getVida() <= 0) {
            return atacado.getNome() + " faleceu!!";
        }
        return this.getNome() + " atacou " + atacado.getNome() + " com " + poderFerramenta.getNome() + " causando " + dano + " de dano";


    }

    public String mostrarTipo(){
        return "";
    }


    public void atualizaVida(Personagem atacado, Double dano) {
        atacado.setVida((atacado.getVida()- Math.abs(dano)));
    }

    public Double verificarDano(Double poderDeAtaque, Double defesa) {
        return Math.abs(poderDeAtaque - defesa);
    }




    public boolean estaVivo() {
        return this.getVida()>0;
    }

    public static int getNumeroPersonagens() {
        return numeroPersonagens;
    }

    @Override
    public String toString() {
        return "\nNome:"+this.nome+"\n"+
                "Vida: "+this.vida;
    }
}
