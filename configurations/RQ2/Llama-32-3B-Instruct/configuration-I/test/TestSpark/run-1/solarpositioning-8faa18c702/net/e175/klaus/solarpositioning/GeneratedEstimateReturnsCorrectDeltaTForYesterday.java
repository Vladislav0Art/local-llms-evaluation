package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Calendar;

import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedEstimateReturnsCorrectDeltaTForYesterday {

    public LocalDateTime now() {
        return LocalDate.now().atStartOfDay();
    }

    @Test
    public void estimateReturnsCorrectDeltaTForYesterday() {
        LocalDate yesterday = LocalDate.now().minusDays(1);
        when(Calendar.getInstance().getTime()).thenReturn(yesterday.atStartOfDay());
        double result = DeltaT.estimate(yesterday);
        assertEquals(-1, result);
    }

}