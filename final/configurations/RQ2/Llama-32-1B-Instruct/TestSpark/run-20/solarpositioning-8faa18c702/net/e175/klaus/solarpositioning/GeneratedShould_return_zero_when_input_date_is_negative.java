package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;
import static org.hamcrest.Matchers.contains;

public class GeneratedShould_return_zero_when_input_date_is_negative {

    @Test
    public void should_return_zero_when_input_date_is_negative() {
        LocalDate forDate = LocalDate.now().minusDays(50);
        when(estimate(forDate)).thenReturn(Math::pow);
        double expected = 0.0;
        assertNotEquals(Double.NaN, estimate(forDate));
        assertEquals(expected, estimate(forDate), 1e-9);
    }

}