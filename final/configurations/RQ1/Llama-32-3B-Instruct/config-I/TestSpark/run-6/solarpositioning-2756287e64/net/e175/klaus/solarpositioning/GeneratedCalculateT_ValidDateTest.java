package net.e175.klaus.solarpositioning;

public class GeneratedCalculateT_ValidDateTest {

    @Test
    public void calculateT_ValidDateTest() {
        final ZonedDateTime date = ZonedDateTime.now();
        double t = Grena3.calcT(date);
        assertTrue(t > 0);
    }
}

}