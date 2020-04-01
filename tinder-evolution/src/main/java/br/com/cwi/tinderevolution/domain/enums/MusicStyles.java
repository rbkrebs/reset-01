package br.com.cwi.tinderevolution.domain.enums;

public enum MusicStyles {

    SERTANEJO("Sertanejo"), ROCK("Rock"),
    SAMBA("Samba"), PAGODE("Pagode"),
    ELETRONICA("Eletronica"), CLASSICA("Classica");

    private String descricao;

    MusicStyles(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Music Styles{" +
                "descricao='" + descricao + '\'' +
                '}';
    }
}