package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate date = LocalDate.of(1990, 1, 1);
        double estimatedValue = DeltaT.estimate(date);
        assertNotNull(estimatedValue);
    }

}