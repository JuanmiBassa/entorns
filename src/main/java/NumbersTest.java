import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumbersTest {
    public static void main(String[] args) {

    }

    @Test
    public void donat_0() {
        assertEquals("Zero", NumbersCat.say(0));
    }

    @Test
    public void donat_1() {
        assertEquals("Un", NumbersCat.say(1));
    }

    @Test
    public void donat_menys3() {
        assertEquals("Donat -3 ens torna Menys Tres", "Menys tres", NumbersCat.say(-3));
    }

    @Test
    public void decenas() {
        assertEquals("Trenta", NumbersCat.say(30));
        assertEquals("Quaranta", NumbersCat.say(40));
    }

    @Test
    public void donat_20() {
        assertEquals("Vint", NumbersCat.say(20));
        assertEquals("Vint-i-dos", NumbersCat.say(22));
    }

    @Test
    public void donat_45() {
        assertEquals("Quaranta-cinc", NumbersCat.say(45));
    }

    @Test
    public void donat_50() {
        assertEquals("Cinquanta", NumbersCat.say(50));
    }

    @Test
    public void donat_60() {
        assertEquals("Seixanta", NumbersCat.say(60));
    }

    @Test
    public void donat_70() {
        assertEquals("Setanta", NumbersCat.say(70));
    }

    @Test
    public void donat_80() {
        assertEquals("Vuitanta", NumbersCat.say(80));
    }

    @Test
    public void donat_90() {
        assertEquals("Noranta", NumbersCat.say(90));
    }

    @Test
    public void donat_100() {
        assertEquals("Cent", NumbersCat.say(100));
    }

    @Test
    public void donat_105() {
        assertEquals("Cent cinc", NumbersCat.say(105));
    }

    @Test
    public void donat_125() {
        assertEquals("Cent vint-i-cinc", NumbersCat.say(125));
    }

    @Test
    public void donat_199() {
        assertEquals("Cent noranta-nou", NumbersCat.say(199));
    }

    @Test
    public void donat_200() {
        assertEquals("Dos-cents", NumbersCat.say(200));
    }

    @Test
    public void donat_256() {
        assertEquals("Dos-cents cinquanta-sis", NumbersCat.say(256));
    }

    @Test
    public void donat_422() {
        assertEquals("Quatre-cents vint-i-dos", NumbersCat.say(422));
    }

    @Test
    public void donat_666() {
        assertEquals("Sis-cents seixanta-sis", NumbersCat.say(666));
    }

    @Test
    public void donat_999() {
        assertEquals("Nou-cents noranta-nou", NumbersCat.say(999));
    }

    @Test
    public void donat_1000() {
        assertEquals("Mil", NumbersCat.say(1000));
    }

    @Test
    public void donat_1025() {
        assertEquals("Mil vint-i-cinc", NumbersCat.say(1025));
    }

    @Test
    public void donat_851725() {
        assertEquals("Vuit-cents cincuanta-un-mil set-cents vint-i-cinc", NumbersCat.say(851725));
    }
}
