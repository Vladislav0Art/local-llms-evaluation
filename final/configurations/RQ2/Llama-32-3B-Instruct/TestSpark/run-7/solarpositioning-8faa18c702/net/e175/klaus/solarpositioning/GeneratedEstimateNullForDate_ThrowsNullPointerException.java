package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.time.LocalDate;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GeneratedEstimateNullForDate_ThrowsNullPointerException {

    @Test
    public void estimateNullForDate_ThrowsNullPointerException() {
        NullPointerException expectedException = new NullPointerException();
        try {
            DeltaT.estimate(null);
            fail("Expected NullPointerException but no exception was thrown");
        } catch (NullPointerException e) {
            org.junit.Assert.assertEquals(e, expectedException);
        }
    }

}