package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPositioning {

    private String result;

    @Test
    public void testSolarPositioning() {
        result = new double[]{75, -22, 90, -25, 35};
        assertEquals(75.0, Math.toRadians(result[0]), 1);
        assertEquals(-22.0, Math.toRadians(result[1]), 1);
        assertEquals(90.0, Math.toRadians(result[2]), 1);
        assertEquals(-25.0, Math.toRadians(result[3]), 1);
        assertEquals(35.0, Math.toRadians(result[4]), 1);
    }

    public double getA() {
        return result[0];
    }

    public double getBaz() {
        return result[1];
    }

}