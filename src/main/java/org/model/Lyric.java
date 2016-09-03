package org.model;

public class Lyric {
    private String lyric;
    //currently just a string, tbd enhancing this to include words that span notes, syllable info, etc

    public Lyric(String lyric) {

        this.lyric = lyric;
    }

    public String getLyric() {
        return lyric;
    }

    public void setLyric(String lyric) {
        this.lyric = lyric;
    }
}
