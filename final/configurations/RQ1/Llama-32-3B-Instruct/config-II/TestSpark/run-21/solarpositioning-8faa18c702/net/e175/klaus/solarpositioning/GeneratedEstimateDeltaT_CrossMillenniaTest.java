package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedEstimateDeltaT_CrossMillenniaTest {

    @Test
    public void estimateDeltaT_CrossMillenniaTest() {
        LocalDate date = LocalDate.of(-2004, 1, 1);
        double result = DeltaT.estimate(date);
        assertEquals(62.92 + 0.32217 * (-2004), result, 0.00001);
    }

}