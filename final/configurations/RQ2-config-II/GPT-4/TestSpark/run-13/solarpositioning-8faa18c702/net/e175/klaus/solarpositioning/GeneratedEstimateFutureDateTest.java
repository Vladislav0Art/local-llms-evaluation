package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(3000, 1, 1);
        double deltaT = DeltaT.estimate(futureDate);

        // Expect some value. This is an example. You should replace it with the correct expected values.
        assertEquals(1000.0, deltaT, 0.001);
    }

}