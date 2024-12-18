package net.e175.klaus.solarpositioning;

import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class GeneratedTestEstimateForCurrentDate {

    @Test
    public void testEstimateForCurrentDate() {
        LocalDate date = LocalDate.now();
        String dateString = (date.atStartOfDay().getHour() * 60 + date.atStartOfDay().getMinute()) / MINUTE_IN_DAY + "January1";
        double deltaT = DeltaT.estimate(LocalDate.parse(dateString, 0));
        assertEquals(5, deltaT, 0.01);
    }

    public class DeltaT {

        private static final int MINUTE_IN_DAY = 86400000;

        public static double estimate(LocalDate forDate) {
            long epoch = forDate.atStartOfDay().getEpochSecond();
            return (double) epoch / MINUTE_IN_DAY - 1;
        }
    }

}