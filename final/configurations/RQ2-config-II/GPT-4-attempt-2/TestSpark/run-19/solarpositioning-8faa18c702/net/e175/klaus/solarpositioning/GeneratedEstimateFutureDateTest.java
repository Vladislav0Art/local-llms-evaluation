package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        LocalDate date = LocalDate.now().plusYears(10);
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

}