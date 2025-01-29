package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;

public class GeneratedTestEstimate_DifferentDatesWithZeroValue {

    public static final String DATE_FORMAT = "yyyy-MM-dd";

    @Test
    public void testEstimate_DifferentDatesWithZeroValue() {
        LocalDate forDate1 = mock(LocalDate.class);
        LocalDate forDate2 = mock(LocalDate.class);

        // When
        double result = new DeltaT().estimate(forDate1);
        result = new DeltaT().estimate(forDate2);

        // Then
        assertEquals(0.001, result, 0.01);
    }

}