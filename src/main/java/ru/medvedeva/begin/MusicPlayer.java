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
        System.out.println(musicList.get(0).getSong()+" "+musicList.get(1).getSong()+" "+musicList.get(2).getSong());

    }
}
