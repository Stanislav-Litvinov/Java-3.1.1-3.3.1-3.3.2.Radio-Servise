package ru.netology;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setNextStation(int CurrentStation) {
        if (CurrentStation > 9) {
            CurrentStation = 0;
        }
        this.currentStation = CurrentStation;
    }

    public void setPrevStation(int CurrentStation) {
        if (CurrentStation < 0) {
            CurrentStation = 9;
        }
        this.currentStation = CurrentStation;
    }

    public void setCurrentStation(int CurrentStation) {
        if (CurrentStation < 0) {
            setPrevStation(CurrentStation);
            return;
        }
        if (CurrentStation > 9) {
            setNextStation(CurrentStation);
            return;
        }
        this.currentStation = CurrentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int CurrentVolume) {
        if (CurrentVolume < 10) {
            this.currentVolume = CurrentVolume + 1;
        }
    }

    public void decreaseVolume(int CurrentVolume) {
        if (CurrentVolume > 0) {
            this.currentVolume = CurrentVolume - 1;
        }
    }

    public void boundsVolume(int CurrentVolume) {
        if (CurrentVolume > 10) {
            CurrentVolume = 10;

        }
        if (CurrentVolume < 0) {
            CurrentVolume = 0;
        }
        this.currentVolume = CurrentVolume;
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

