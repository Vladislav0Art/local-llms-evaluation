package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedTestEstimateForDifferentDay {

    public double estimateForValidDate(LocalDate forDate) {
        return pow(0.00001, forDate.getDayOfMonth());
    }

    @Test
    public void testEstimateForDifferentDay() {
        LocalDate differentDate = LocalDate.of(2022, 1, 1);
        double actualValue = estimateForDifferentDay(differentDate);
        assertEquals(0.000012, actualValue, 0.001);
    }

}