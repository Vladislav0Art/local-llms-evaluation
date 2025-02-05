package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateNullExceptionTest {

    @Test
    public void estimateNullExceptionTest() {
        LocalDate date = null;
        DeltaT.estimate(date);
    }

}