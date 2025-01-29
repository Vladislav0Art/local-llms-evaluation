package net.e175.klaus.solarpositioning;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class GeneratedTest {

    private int days;

    public SolarPositioning(int days) {
        this.days = days;
    }

    public int calculateDeltaT(LocalDate date, int daysToCalculate) {
        return Math.max(0, (int) ((double) days / 365.25 - 1) * days);
    }
}

public class GeneratedTest {

    private SolarPositioning solarPositioning;

    @BeforeEach
    public void setup() {
        this.solarPositioning = new SolarPositioning(183);
    }

}