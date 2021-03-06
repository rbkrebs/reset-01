package br.com.cwi.tinderevolution.collection;

import br.com.cwi.tinderevolution.domain.Music;

import java.util.ArrayList;
import java.util.List;

public class MusicCollection  {

    private static int counter = 1;
    private static final List<Music> listMusic = new ArrayList<>();


    public Music save(Music music) {
        music.setId(counter++);
        listMusic.add(music);
        return music;
    }


    public List<Music> listAll() {
        return listMusic;
    }


    public Music findById(int id) {


            return this.listMusic.stream().filter(music-> music.getId() == id).findFirst().get();



    }

    public Music findByName(String nomeMusica) {

        return this.listMusic.stream().filter(music-> music.getNome().equals(nomeMusica)).findFirst().get();

    }


    public boolean delete(int id) {
        return false;
    }


    public Music update(int id, Music newMusic){


        Music music = findById(id);
        music.setAutor(newMusic.getAutor());
        music.setDataDeLancamento(newMusic.getDataDeLancamento());
        music.setNome(newMusic.getNome());
        music.setMusicSyles(newMusic.getMusicSyles());

        return music;
    }


}
