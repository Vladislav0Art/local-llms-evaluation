package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.time.LocalDate;

public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        LocalDate fordate = null;
        double result = DeltaT.estimate(fordate);
    }

}