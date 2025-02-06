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
public class GeneratedEstimate ReturnsCorrectResultForNonLeapYear_WithinSolarMonth {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate

    ReturnsCorrectResultForNonLeapYear_WithinSolarMonth() {
        LocalDate date = LocalDate.of(2020, 12, 15);
        Mockito.when(forDate.isAfter()).thenReturn(true);
        Mockito.when(forDate.atStartOfDay().atZone(Mockito.any())).thenReturn(date.atZone(Mockito.any()));
        double result = deltaT.estimate(forDate);
        assertEquals("1.5644", String.format("%.6f", result), 0.001);
    }

}