package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.*;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        LocalDate date = LocalDate.now().minusYears(1); // Date 1 year in the past
        double deltaT = DeltaT.estimate(date);
        assertNotNull(deltaT);
    }

}