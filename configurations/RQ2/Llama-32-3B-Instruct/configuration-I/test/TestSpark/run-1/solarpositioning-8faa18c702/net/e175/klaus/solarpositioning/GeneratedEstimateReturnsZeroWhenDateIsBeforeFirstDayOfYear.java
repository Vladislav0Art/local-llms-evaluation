package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedEstimateReturnsZeroWhenDateIsBeforeFirstDayOfYear {

    @Test
    public void estimateReturnsZeroWhenDateIsBeforeFirstDayOfYear() {
        LocalDate date = LocalDate.of(2022, 12, 25);
        when(Calendar.getInstance().getTime()).thenReturn(date.atStartOfDay());
        double result = DeltaT.estimate(date);
        assertEquals(0, result);
    }

}