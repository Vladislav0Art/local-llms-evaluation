package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateNormalDateTest {

    @Test
    public void estimateNormalDateTest() {
        LocalDate date = LocalDate.of(2000, 5, 23);
        double result = DeltaT.estimate(date);
        assertNotNull(result);
    }

}