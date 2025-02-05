package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate pastDate = LocalDate.of(1899, 12, 31);
        double deltaT = DeltaT.estimate(pastDate);

        // Expect some value. This is an example. You should replace it with the correct expected values.
        assertEquals(0.0, deltaT, 0.001);
    }

}