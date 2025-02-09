package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate futureDate = LocalDate.of(2030, 1, 1);
        double result = DeltaT.estimate(futureDate);
        // assert according to your known result here.
    }

}