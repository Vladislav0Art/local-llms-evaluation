package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate ReturnsCorrectResultForLeapYear_JustBeforeSolarMonth {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate

    ReturnsCorrectResultForLeapYear_JustBeforeSolarMonth() {
        LocalDate date = LocalDate.of(2021, 12, 10);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        double result = deltaT.estimate(forDate);
        assertEquals("2.2446", String.format("%.6f", result), 0.001);
    }

}