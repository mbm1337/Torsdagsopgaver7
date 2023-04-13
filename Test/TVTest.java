import TV.TV;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TVTest {

    TV tv1;
    TV tv2;

    @org.junit.jupiter.api.BeforeEach
    public void setUp() {
        tv1 = new TV();
        tv2 = new TV();
    }

    @Test
    public void testTV1(){
        tv1.turnOn();
        assertTrue(tv1.isOn);
        tv1.setChannel(30);
        assertEquals(30,tv1.channel);
        tv1.setVolume(3);
        assertEquals(3,tv1.volume);
        tv1.channelUp();
        assertEquals(1,tv1.channel);

    }

    @Test
    public void testTV2(){
        tv2.channelUp();
        assertTrue(tv2.isOn);
        assertEquals(1,tv2.channel);
        tv2.channelUp();
        assertEquals(2,tv2.channel);
        tv2.turnOff();
        assertFalse(tv2.isOn);
        tv2.volumeUp();
        assertEquals(10,tv2.volume);

    }





}