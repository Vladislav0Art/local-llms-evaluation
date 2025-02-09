package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class GeneratedEstimateWithLeapYearTest {

    @Test
    public void estimateWithLeapYearTest() {
        LocalDate leapYearDate = LocalDate.of(2000, 2, 29);
        double result = DeltaT.estimate(leapYearDate);
        // assert according to your known result here.
    }

}