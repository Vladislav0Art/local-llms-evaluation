package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateDateInTheFutureTest {

    @Test
    public void estimateDateInTheFutureTest() {
        LocalDate futureDate = LocalDate.now().plusYears(1);
        double expectedValue = 72.463;

        double actualValue = DeltaT.estimate(futureDate);

        assertEquals(expectedValue, actualValue, 0.001);
    }

}