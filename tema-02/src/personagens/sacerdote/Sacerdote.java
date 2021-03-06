package personagens.sacerdote;

import ataques.Magia;
import personagens.Personagem;

public abstract class Sacerdote extends Personagem {

    Double mana;

    Magia magia;

    public Sacerdote(){

    }

    public Sacerdote(String nome, Double vida, Double ataque, Double defesa, Double mana, Magia magia) {
        super(nome, vida, ataque, defesa);
        this.mana = mana;
        this.magia = magia;
    }

    public Double getMana() {
        return mana;
    }

    public void setMana(Double mana) {
        this.mana = mana;
    }

    public void usaMagia(){

        this.setMana(this.getMana()- this.magia.getCustoMana());

    }

    public boolean temFe(){
        return this.getMana()>=this.magia.getCustoMana();
    }
}
