package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateDateInThePastTest {

    @Test
    public void estimateDateInThePastTest() {
        LocalDate pastDate = LocalDate.now().minusYears(1);

        double expectedValue = 68.766;

        double actualValue = DeltaT.estimate(pastDate);

        assertEquals(expectedValue, actualValue, 0.001);
    }

}