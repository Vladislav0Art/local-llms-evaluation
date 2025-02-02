package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class GeneratedEstimate_DeltaTPast1999ShouldBeGreaterThen1908 {

    public static double estimate(LocalDate forDate) {
        // method implementation
        return 0;
    }

    public static int decimalYear(LocalDate forDate) {
        // method implementation
        return 0;
    }
}

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class DeltaTTest {

    @Test
    public void estimate_DeltaTPast1999ShouldBeGreaterThen1908() {
        LocalDate date = LocalDate.of(-500, 11, 30);
        int year = (int) DeltaT.decimalYear(date);
        assertThat(year, greaterThan(1908));
    }

}