package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.of(3000, 12, 31);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}