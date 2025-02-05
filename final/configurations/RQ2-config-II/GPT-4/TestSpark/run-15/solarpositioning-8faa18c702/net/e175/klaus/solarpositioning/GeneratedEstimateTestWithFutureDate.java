package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestWithFutureDate {

    @Test
    public void estimateTestWithFutureDate() {
        LocalDate futureDate = LocalDate.of(2100, 12, 31);
        double deltaT = DeltaT.estimate(futureDate);
        assertEquals(420.17, deltaT, 0.01);
    }

}