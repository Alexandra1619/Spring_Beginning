package ru.medvedeva.begin;

public class MusicPlayer {
    private Music music;
private int v;
    //IoC
    public MusicPlayer(Music music)
    {
        this.music=music;
    }
    public MusicPlayer()
    {

    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public void PlayMusic()
    {
        System.out.println("Playing "+music.getSong());
    }
}
