package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateNullDateTest {

    @Test
    public void estimateNullDateTest() {
        try {
            double result = DeltaT.estimate(null);
            fail("Should throw NullPointerException when passed null");
        } catch (NullPointerException ex) {
            // Expected exception
        }
    }

}