package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

public class Radio {
    private int currentStation = 10;
    private int maxRadioStation = 10;
    private int minRadioStation = 0;
    private int currentVolume;
    private int maxVolume = 100;
    private int minVolume = 0;


    public Radio(int generateNewStation) {
        this.currentStation = generateNewStation;
        maxRadioStation = generateNewStation - 1;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxRadioStation) {
            currentStation = minRadioStation;
        }
        if (currentStation < minRadioStation) {
            currentStation = maxRadioStation;
        }
        this.currentStation = currentStation;
    }

    public void pressNextStation() {
        if (currentStation >= maxRadioStation) {
            setCurrentStation(minRadioStation);
        } else {
            setCurrentStation(currentStation + 1);
        }
    }

    public void pressPrevStation() {
        if (currentStation <= minRadioStation) {
            setCurrentStation(maxRadioStation);
        } else {
            setCurrentStation(currentStation - 1);
        }
    }

    public void setMaxRadioStation(int maxRadioStation) {
        this.maxRadioStation = maxRadioStation;
    }

    public void setMinRadioStation(int minRadioStation) {
        this.minRadioStation = minRadioStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            currentVolume = minVolume;
        }
        if (currentVolume < minVolume) {
            currentVolume = maxVolume;
        }
        this.currentVolume = currentVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void pressVolumeUp() {
        setCurrentVolume(currentVolume + 1);
    }

    public void pressVolumeDown() {
        setCurrentVolume(currentVolume - 1);
    }
}
