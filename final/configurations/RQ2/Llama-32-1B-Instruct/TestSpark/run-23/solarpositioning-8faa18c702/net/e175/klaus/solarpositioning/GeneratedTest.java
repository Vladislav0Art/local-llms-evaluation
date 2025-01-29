package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import static java.time.LocalDateTime.now;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNever;

public class GeneratedTest {

    public double estimate(LocalDate forDate) { /* implementation */ }

    public static double estimate(LocalDate forDate) {
        if (forDate.isBefore(LocalDate.of(2024, 1, 1))) {
            return -1.0; // Return a negative value
        }
        if (forDate.isAfter(LocalDate.now().plusDays(365))) {
            return Double.MAX_VALUE; // Return infinity
        }

        double timeDifference = forDate.toEpochDay() - now().toEpochDay();
        double yearsSinceNow = (timeDifference / 86400);
        double decimalYears = yearsSinceNow * 100;

        double daysSinceNow = forDate.getYear() * 365 + Math.floor((forDate.getMonthValue() - 1) / 12.0) * 315.576;
        double decimalDays = daysSinceNow * 24;

        if (decimalDays < 0) {
            return Double.MAX_VALUE; // Return infinity
        }

        return Math.min(decimalYears, 10000);
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNever;

public class DeltaTTest {

}