package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class GeneratedTestYearValueOneHundredAndSixtyFiveTest {

    @Test
    public void testYearValueOneHundredAndSixtyFiveTest() {
        assertEquals(29.07 + 0.407 * 165 - pow(165, 2) / 233 + pow(165, 3) / 2547, DeltaT.estimate(LocalDate.of(1965, 12, 31)));
    }
}

}