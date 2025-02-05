package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.time.LocalDate;

public class GeneratedEstimateMockedDateTest {

    @Test
    public void estimateMockedDateTest() {
        LocalDate mockedDate = Mockito.mock(LocalDate.class);
        when(mockedDate.getYear()).thenReturn(2022);
        when(mockedDate.getMonthValue()).thenReturn(12);
        when(mockedDate.getDayOfMonth()).thenReturn(10);
        double result = DeltaT.estimate(mockedDate);
        Assert.assertNotNull(result);
    }

}