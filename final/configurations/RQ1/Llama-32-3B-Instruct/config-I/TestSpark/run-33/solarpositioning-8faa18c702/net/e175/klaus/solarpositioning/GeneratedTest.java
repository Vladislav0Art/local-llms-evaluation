package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class GeneratedTest {

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
    public void estimate_DeltaTPast1999ShouldBeLessThan2000() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, lessThan(2000));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeGreaterThen1973() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, greaterThan(1973));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeLesserThan2000() {
        LocalDate date = LocalDate.of(-500, 12, 31);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, lessThan(2000));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeGreaterThen2001() {
        LocalDate date = LocalDate.of(-500, 11, 30);
        double deltaT = DeltaT.estimate(date);
        assertThat(deltaT, greaterThan(2001));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeLesserThan2000() {
        LocalDate date = LocalDate.of(-500, 12, 31);
        int year = (int) DeltaT.decimalYear(date);
        assertThat(year, lessThan(2000));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeGreaterThen1889() {
        LocalDate date = LocalDate.of(-500, 1, 1);
        int year = (int) DeltaT.decimalYear(date);
        assertThat(year, greaterThan(1889));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeLesserThen1890() {
        LocalDate date = LocalDate.of(-500, 12, 31);
        int year = (int) DeltaT.decimalYear(date);
        assertThat(year, lessThan(1890));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeGreaterThen1908() {
        LocalDate date = LocalDate.of(-500, 11, 30);
        int year = (int) DeltaT.decimalYear(date);
        assertThat(year, greaterThan(1908));
    }

    @Test
    public void estimate_DeltaTPast1999ShouldBeLesserThen1909() {
        LocalDate date = LocalDate.of(-500, 12, 31);
        int year = (int) DeltaT.decimalYear(date);
        assertThat(year, lessThan(1909));
    }

}