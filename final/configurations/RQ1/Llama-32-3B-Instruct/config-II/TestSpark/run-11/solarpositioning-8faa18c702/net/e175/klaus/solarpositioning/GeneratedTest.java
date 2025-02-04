package net.e175.klaus.solarpositioning;

public class GeneratedTest {

    @Test
    public void estimateDeltaTRange_2000To2050_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 63.86) < 0.00001);
    }

    @Test
    public void estimateDeltaTRange_1500To1800_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(1750, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 8.83) < 0.00001);
    }

    @Test
    public void estimateDeltaTRange_1000To1200_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(1050, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 1574.2) < 0.00001);
    }

    @Test
    public void estimateDeltaTRange_200To250_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(200, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 29.07) < 0.00001);
    }

    @Test
    public void estimateDeltaTRange_250To300_DeltaTOutofRange() {
        LocalDate forDate = LocalDate.of(275, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertFalse(expectedValue < -20 || expectedValue > 63.86);
    }

    @Test
    public void estimateDeltaTRange_250To300_MockDecimalYearMethod() {
        // Arrange
        when(DeltaT(decimalYear(Mockito.any(LocalDate >> ()))).thenReturn(10);

        // Act and Assert
        assertEquals(10, DeltaT.estimate(LocalDate.of(275, 1, 1)));
    }

    @Test
    public void estimateDeltaTRange_1820To2000_DeltaTInRange() {
        LocalDate forDate = LocalDate.of(1850, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertTrue(Math.abs(DeltaT.estimate(forDate) - 13.72) < 0.00001);
    }

    @Test
    public void estimateDeltaTRange_0To180_DeltaTOutofRange() {
        LocalDate forDate = LocalDate.of(1, 1, 1);
        double expectedValue = DeltaT.estimate(forDate);
        assertFalse(expectedValue < -20 || expectedValue > 63.86);
    }

    @Test
    public void estimateDeltaTRange_0To180_MockDecimalYearMethod() {
        // Arrange
        when(DeltaT(decimalYear(Mockito.any(LocalDate >> ()))).thenReturn(10);

        // Act and Assert
        assertEquals(10, DeltaT.estimate(LocalDate.of(1, 1, 1)));
    }

}