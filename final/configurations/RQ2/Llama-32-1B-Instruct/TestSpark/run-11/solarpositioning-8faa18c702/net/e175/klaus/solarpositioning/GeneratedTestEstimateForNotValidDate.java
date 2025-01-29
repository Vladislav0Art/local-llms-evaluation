package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import java.time.LocalDate;
import java.util.Random;

public class GeneratedTestEstimateForNotValidDate {

    public double estimateForValidDate(LocalDate forDate) {
        return pow(0.00001, forDate.getDayOfMonth());
    }

    @Test
    public void testEstimateForNotValidDate() {
        LocalDate notValidDate = LocalDate.of(2022, 1, 32);
        assertThrows(UnsupportedOperationException.class, () -> estimateForNotValidDate(notValidDate));
    }

    public int estimateForDifferentDay(LocalDate forDate) {
        return (int) pow(0.00001, forDate.getDayOfMonth());
    }

}