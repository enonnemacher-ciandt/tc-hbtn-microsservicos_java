package com.song.demo;

import java.util.Objects;

public class Song {

    private int id;
    private String nome;
    private String Artista;
    private String album;
    private String anoLancamento;

    public Song() {
    }

    public Song(int id, String nome, String artista, String album, String anoLancamento) {
        this.id = id;
        this.nome = nome;
        Artista = artista;
        this.album = album;
        this.anoLancamento = anoLancamento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String artista) {
        Artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return id == song.id && Objects.equals(nome, song.nome) && Objects.equals(Artista, song.Artista) && Objects.equals(album, song.album) && Objects.equals(anoLancamento, song.anoLancamento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, Artista, album, anoLancamento);
    }

    @Override
    public String toString() {
        return "Song{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", Artista='" + Artista + '\'' +
                ", album='" + album + '\'' +
                ", anoLancamento='" + anoLancamento + '\'' +
                '}';
    }
}
