package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_CrossCenturiesTest {

    @Test
    public void estimateDeltaT_CrossCenturiesTest() {
        LocalDate date = LocalDate.of(-1500, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(62.92 + 0.32217 * (-1600), result, 0.00001);
    }

}