package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDateWithNonLeapYearTest {

    @Test
    public void estimateDateWithNonLeapYearTest() {
        LocalDate nonLeapYearDate = LocalDate.of(2019, 2, 28);
        double deltaT = DeltaT.estimate(nonLeapYearDate);

        // Expect some value. This is an example. You should replace it with the correct expected values.
        assertEquals(150.0, deltaT, 0.001);
    }

}