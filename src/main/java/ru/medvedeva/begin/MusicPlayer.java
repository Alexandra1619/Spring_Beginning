package ru.medvedeva.begin;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {
    private List<Music>musicList=new ArrayList<>();
    public MusicPlayer()
    {

    }
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void PlayMusicList()
    {
        for (Music music:musicList) {
            System.out.println(music.getSong());
        }

    }
}
