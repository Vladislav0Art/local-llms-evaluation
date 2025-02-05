package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2071, 1, 1);
        double deltaT = DeltaT.estimate(futureDate);

        // Assert something here based on the expectations
        assertNotNull(deltaT);
    }

}