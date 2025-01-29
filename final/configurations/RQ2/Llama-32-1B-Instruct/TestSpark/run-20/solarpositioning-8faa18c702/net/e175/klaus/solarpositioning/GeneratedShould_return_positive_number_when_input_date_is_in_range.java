package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.contains;

public class GeneratedShould_return_positive_number_when_input_date_is_in_range {

    @Test
    public void should_return_positive_number_when_input_date_is_in_range() {
        LocalDate forDate = LocalDate.now();
        when(estimate(forDate)).thenReturn(Math::pow);
        double expected = Math.pow(2.0, 50);
        assertNotEquals(Double.NaN, estimate(forDate));
        assertEquals(expected, estimate(forDate), 1e-9);
    }

}