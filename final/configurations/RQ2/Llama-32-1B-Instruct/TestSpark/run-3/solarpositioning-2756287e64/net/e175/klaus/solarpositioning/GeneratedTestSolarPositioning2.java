package net.e175.klaus.solarpositioning;

public class GeneratedTestSolarPositioning2 {

    private String result;

    @Test
    public void testSolarPositioning2() {
        result = new double[]{75, -22, 90, -25, 35};
        assertEquals(75.0, Math.toRadians(result[3]), 1);
        assertEquals(-22.0, Math.toRadians(result[4]), 1);
        assertEquals(90.0, Math.toRadians(result[5]), 1);
        assertEquals(-25.0, Math.toRadians(result[2]), 1);
        assertEquals(35.0, Math.toRadians(result[6]), 1);
    }

    public double getA() {
        return result[3];
    }

    public double getBaz() {
        return result[4];
    }

}