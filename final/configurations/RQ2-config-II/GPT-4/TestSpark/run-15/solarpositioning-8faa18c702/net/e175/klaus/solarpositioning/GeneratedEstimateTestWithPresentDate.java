package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimateTestWithPresentDate {

    @Test
    public void estimateTestWithPresentDate() {
        LocalDate presentDate = LocalDate.now();
        double deltaT = DeltaT.estimate(presentDate);
        assertEquals(69.10, deltaT, 0.01);
    }

}