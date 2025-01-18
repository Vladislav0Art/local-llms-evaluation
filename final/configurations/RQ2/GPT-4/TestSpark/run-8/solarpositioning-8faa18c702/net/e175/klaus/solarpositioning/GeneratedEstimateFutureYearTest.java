package net.e175.klaus.solarpositioning;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Test;
import org.mockito.Mockito;

public class GeneratedEstimateFutureYearTest {

    @Test
    public void estimateFutureYearTest() {
        DeltaT.estimate(LocalDate.of(3000, 1, 1));
    }

}