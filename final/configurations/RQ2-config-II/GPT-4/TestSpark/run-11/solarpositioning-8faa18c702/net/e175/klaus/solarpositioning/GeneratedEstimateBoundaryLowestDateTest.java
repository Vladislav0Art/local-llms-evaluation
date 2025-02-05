package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateBoundaryLowestDateTest {

    @Test
    public void estimateBoundaryLowestDateTest() {
        LocalDate date = LocalDate.of(-2000, 1, 1);
        double result = DeltaT.estimate(date);

        // Assert with pre-computed value
        assertEquals(result, 2000.0, 0.0);
    }

}