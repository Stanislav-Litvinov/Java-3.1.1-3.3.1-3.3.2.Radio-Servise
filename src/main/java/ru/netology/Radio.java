package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            currentStation = 0;
        }
        if (currentStation > 9) {
            currentStation = 9;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void boundsVolume(int currentVolume) {
        if (currentVolume > 10) {
            currentVolume = 10;

        }
        if (currentVolume < 0) {
            currentVolume = 0;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolumeUp() {
        currentVolume += 1;
        boundsVolume(currentVolume);
    }

    public void decreaseVolumeDown() {
        currentVolume -= 1;
        boundsVolume(currentVolume);
    }
}