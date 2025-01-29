package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimate_LocalDate_Standard {

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    @Test
    public void testEstimate_LocalDate_Standard() {
        LocalDate forDate = mock(LocalDate.class);
        Double result = new DeltaT().estimate(forDate);
        assertEquals(0.001, result, 0.01);
    }

}