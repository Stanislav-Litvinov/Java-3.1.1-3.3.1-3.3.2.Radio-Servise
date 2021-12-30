import org.junit.jupiter.api.Test;
import ru.netology.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    Radio netologyFm = new Radio();

    @Test
    public void shouldSetNextStation() {
        netologyFm.setNextStation(10);
        assertEquals(0, netologyFm.getCurrentStation());

        netologyFm.setNextStation(9);
        assertEquals(9, netologyFm.getCurrentStation());
    }

    @Test
    public void shouldPrevStation() {
        netologyFm.setPrevStation(-1);
        assertEquals(9, netologyFm.getCurrentStation());

        netologyFm.setPrevStation(0);
        assertEquals(0, netologyFm.getCurrentStation());
    }

    @Test
    public void shouldSetCurrentStation() {
        netologyFm.setCurrentStation(5);
        assertEquals(5, netologyFm.getCurrentStation());

        netologyFm.setCurrentStation(-1);
        assertEquals(9, netologyFm.getCurrentStation());

        netologyFm.setCurrentStation(11);
        assertEquals(0, netologyFm.getCurrentStation());
    }

    @Test
    public void shouldIncreaseVolume() {
        netologyFm.increaseVolume(10);
        assertEquals(0, netologyFm.getCurrentVolume());

        netologyFm.increaseVolume(8);
        assertEquals(9, netologyFm.getCurrentVolume());
    }

    @Test
    public void shouldDecreaseVolume() {
        netologyFm.decreaseVolume(0);
        assertEquals(0, netologyFm.getCurrentVolume());

        netologyFm.decreaseVolume(8);
        assertEquals(7, netologyFm.getCurrentVolume());
    }

    @Test
    public void setCurrentVolume() {
        netologyFm.boundsVolume(8);
        assertEquals(8, netologyFm.getCurrentVolume());

        netologyFm.boundsVolume(11);
        assertEquals(10, netologyFm.getCurrentVolume());

        netologyFm.boundsVolume(-1);
        assertEquals(0, netologyFm.getCurrentVolume());
    }

    @Test
    public void setVolumeUp() {
        netologyFm.boundsVolume(1);
        netologyFm.increaseVolumeUp();
        assertEquals(2, netologyFm.getCurrentVolume());

        netologyFm.boundsVolume(10);
        netologyFm.increaseVolumeUp();
        assertEquals(10, netologyFm.getCurrentVolume());
    }

    @Test
    public void setVolumeDown() {
        netologyFm.boundsVolume(1);
        netologyFm.decreaseVolumeDown();
        assertEquals(0, netologyFm.getCurrentVolume());

        netologyFm.boundsVolume(0);
        netologyFm.decreaseVolumeDown();
        assertEquals(0, netologyFm.getCurrentVolume());
    }
}
