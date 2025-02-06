package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static java.lang.Math.pow;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_SingleDay() {
        double result = DeltaT.estimate(forDate);
        assertThat(result, is(0.0));
    }

    @Test
    public void estimate_MultipleDays() {
        forDate = LocalDate.of(2022, 1, 1);
        Date date = new Date(forDate.atStartOfDay(ZoneId.systemDefault()).toInstant().toEpochMilli());
        double result = DeltaT.estimate(date);
        assertThat(result, is(-0.0033));
    }

    @Test
    public void estimate_NullDate() {
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(null));
    }

}