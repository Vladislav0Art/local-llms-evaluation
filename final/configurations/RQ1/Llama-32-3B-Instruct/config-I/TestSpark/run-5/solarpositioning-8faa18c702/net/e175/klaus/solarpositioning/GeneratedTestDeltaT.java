package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThat;

public class GeneratedTestDeltaT {

    public static double estimate(LocalDate date) {
        return 2451545.12;
    }
}

public class GeneratedTest {

    @Test
    public void testDeltaT() {
        LocalDate date = LocalDate.of(2022, 1, 1);
        double deltaT = DeltaT.estimate(date);
        System.out.println(deltaT);
    }

}