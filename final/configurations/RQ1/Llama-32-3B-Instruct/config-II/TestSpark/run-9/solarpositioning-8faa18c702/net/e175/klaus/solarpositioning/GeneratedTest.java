package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void estimateValidYearTest() {
        LocalDate forDate = LocalDate.of(2000, 1, 1);
        double expectedDeltaT = 63.86;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

    @Test
    public void estimateYearBefore1900Test() {
        LocalDate forDate = LocalDate.of(1850, 1, 1);
        double expectedDeltaT = 7.62;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

    @Test
    public void estimateYearAfter2005Test() {
        LocalDate forDate = LocalDate.of(2010, 1, 1);
        double expectedDeltaT = 63.86;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

    @Test
    public void estimateYearBefore1950Test() {
        LocalDate forDate = LocalDate.of(1949, 1, 1);
        double expectedDeltaT = 29.07;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

    @Test
    public void estimateYearBefore1975Test() {
        LocalDate forDate = LocalDate.of(1974, 1, 1);
        double expectedDeltaT = 45.45;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }

    @Test
    public void estimateYearAfter1820Test() {
        LocalDate forDate = LocalDate.of(1821, 1, 1);
        double expectedDeltaT = -20;
        double actualDeltaT = DeltaT.estimate(forDate);
        assertEquals(expectedDeltaT, actualDeltaT);
    }
}

}