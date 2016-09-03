package org.model;

public class Time {
    private int beats;
    private int beatType;

    public Time(int beats, int beatType) {

        this.beats = beats;
        this.beatType = beatType;
    }

    public int getBeats() {
        return beats;
    }

    public void setBeats(int beats) {
        this.beats = beats;
    }

    public int getBeatType() {
        return beatType;
    }

    public void setBeatType(int beatType) {
        this.beatType = beatType;
    }

    @Override
    public String toString() {
        return Integer.toString(beats)+"/"+Integer.toString(beatType);
    }
}
