package me.santong.weather.models.suggestion;

import me.santong.weather.framework.Entity;

/**
 * Created by santong.
 * At 16/5/24 22:10
 */
public class Comf extends Entity{
    private String brf;
    private String txt;

    public String getBrf() {
        return brf;
    }

    public void setBrf(String brf) {
        this.brf = brf;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    @Override
    public String toString() {
        return "Flu{" +
                "brf='" + brf + '\'' +
                ", txt='" + txt + '\'' +
                '}';
    }
}
