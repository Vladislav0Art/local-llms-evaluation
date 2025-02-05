package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateBoundaryHighestDateTest {

    @Test
    public void estimateBoundaryHighestDateTest() {
        LocalDate date = LocalDate.of(3000, 1, 1);
        double result = DeltaT.estimate(date);

        // Assert with pre-computed value
        assertEquals(result, 18225.0, 0.0);
    }

}