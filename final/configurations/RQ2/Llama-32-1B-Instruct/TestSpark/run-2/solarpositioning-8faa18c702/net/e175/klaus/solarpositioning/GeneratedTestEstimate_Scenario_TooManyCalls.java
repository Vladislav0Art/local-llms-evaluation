package net.e175.klaus.solarpositioning;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedTestEstimate_Scenario_TooManyCalls {

    public double estimate(LocalDate date) {
        return pow(1 - (date.getYear() / 100), (date.getMonthValue() / 12) * 29.444);
    }

    @Test
    public void testEstimate_Scenario_TooManyCalls() {
        for (int i = 1; i <= 10000; i++) {
            DeltaT.estimate(LocalDate.of(2024, 1, 1));
        }
    }

}