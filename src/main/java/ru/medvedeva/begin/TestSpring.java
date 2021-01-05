package ru.medvedeva.begin;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("appContext.xml");
       //Music music= context.getBean("musicBean",Music.class);
      // MusicPlayer musicPlayer=new MusicPlayer(music);
        MusicPlayer musicPlayer=context.getBean("musicPlayer",MusicPlayer.class);
        musicPlayer.PlayMusic();

        System.out.println(musicPlayer.getV());
        context.close();
    }
}