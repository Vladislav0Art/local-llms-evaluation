package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDateWithLeapYearTest {

    @Test
    public void estimateDateWithLeapYearTest() {
        LocalDate leapYearDate = LocalDate.of(2020, 2, 29);
        double deltaT = DeltaT.estimate(leapYearDate);

        // Expect some value. This is an example. You should replace it with the correct expected values.
        assertEquals(200.0, deltaT, 0.001);
    }

}