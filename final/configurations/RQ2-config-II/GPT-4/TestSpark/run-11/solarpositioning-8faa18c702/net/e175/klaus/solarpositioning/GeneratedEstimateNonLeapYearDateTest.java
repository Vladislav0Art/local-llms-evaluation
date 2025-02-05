package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateNonLeapYearDateTest {

    @Test
    public void estimateNonLeapYearDateTest() {
        LocalDate date = LocalDate.of(2021, 2, 28);
        double result = DeltaT.estimate(date);

        // Assert with pre-computed value
        assertEquals(result, 71.0, 0.0);
    }

}