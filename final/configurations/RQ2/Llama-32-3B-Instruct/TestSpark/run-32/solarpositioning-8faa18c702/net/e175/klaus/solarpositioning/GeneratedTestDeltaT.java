package net.e175.klaus.solarpositioning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class GeneratedTestDeltaT {

    public Optional<Double> estimate(LocalDate date) {
        return Optional.empty();
    }
}

public class LocalDate {
    private int year;
    private int month;
    private int day;

    public LocalDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public static LocalDate of(int year, int month, int day) {
        return new LocalDate(year, month, day);
    }
}

public class GeneratedTest {

    @Test
    public void testDeltaT() {
        DeltaT deltaT = new DeltaT();
        Optional<Double> result1 = deltaT.estimate(LocalDate.of(2022, 6, 21));
        assertEquals(Optional.empty(), result1);

        Optional<Double> result2 = deltaT.estimate(LocalDate.of(2021, 6, 21));
        assertEquals(Optional.empty(), result2);

        Optional<Double> result3 = deltaT.estimate(LocalDate.of(2023, 6, 21));
        assertEquals(Optional.empty(), result3);
    }

}