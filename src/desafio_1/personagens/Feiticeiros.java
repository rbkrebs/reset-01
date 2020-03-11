package desafio_1.personagens;

import desafio_1.ataques.Magias;

public class Feiticeiros extends Personagem {

    Integer mana;

    Magias magias;

    Feiticeiros(String nome, Integer vida, Integer ataque, Integer defesa, Integer mana , Magias magias){
        super(nome, vida, ataque, defesa);
        this.mana = mana;
        this.magias = magias;


    }

    void usaMagia(){

        this.mana -= this.magias.getCustoMana();

    }

}
