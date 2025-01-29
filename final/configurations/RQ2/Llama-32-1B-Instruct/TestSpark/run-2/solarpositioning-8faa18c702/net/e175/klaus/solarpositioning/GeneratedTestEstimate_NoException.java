package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestEstimate_NoException {

    public double estimate(LocalDate date) {
        return pow(1 - (date.getYear() / 100), (date.getMonthValue() / 12) * 29.444);
    }

    @Test
    public void testEstimate_NoException() {
        LocalDate localDate = LocalDate.of(2022, 1, 1);
        double result = estimate(localDate);
        assertEquals(0, result);
    }

}