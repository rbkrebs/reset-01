package exec_heranca.classes;

import exec_heranca.enums.Combustivel;

public class Navio extends Aquatico {
    public Navio(String nome, Double velocidadeMaxima, Combustivel combustivel, Integer lotacaoMaxima, Integer numeroRodas, Double profundidademaxima) {
        super(nome, velocidadeMaxima, combustivel, lotacaoMaxima, numeroRodas, profundidademaxima);
    }
}
