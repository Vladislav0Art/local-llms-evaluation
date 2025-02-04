package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import static java.lang.Math.pow;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GeneratedTestEstimateWithMocking {

    @Test
    public void testEstimateWithMocking() throws Exception {
        long mockYears[] = {1995};
        for (int i = 0; i < mockYears.length; i++) {
            LocalDate date = LocalDate.of(mockYears[i], 1, 1);
            double result = DeltaT.estimate(date);
            System.out.println(" mockYears[" + i + "]=" + result);

        }
    }

}