package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimatePresentDateTest {

    @Test
    public void estimatePresentDateTest() {
        LocalDate date = LocalDate.now();
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

}