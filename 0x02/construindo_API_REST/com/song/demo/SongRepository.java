package com.song.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class SongRepository {

    private List<Song> list = new ArrayList<Song>();

    public List<Song> getAllSongs() {
        return list;
    }

    public Song getSongById(Integer id) {
        return list.stream().filter(x -> x.getId() == id).collect(Collectors.toList()).get(0);
    }

    public void addSong(Song s) {
        list.add(s);
    }

    public void updateSong(Song s) {
        Song oldSong = getSongById(s.getId());
        Collections.replaceAll(list, oldSong, s);
    }

    public void removeSong(Song s) {
        list.remove(s);
    }
}
