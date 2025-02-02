package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSolarPosition_MonthOutsideRange_ReturnsCorrectT {

    private Grena3 grena3;

    @Before
    public void setUp() {
        grena3 = new Grena3();
    }

    @Test
    public void calculateSolarPosition_MonthOutsideRange_ReturnsCorrectT() {
        ZonedDateTime date = ZonedDateTime.now().withMonth(1).withDayOfMonth(31);
        double deltaT = 1.0;
        double t = grena3.calcT(date);
        assertEquals(t, 12.5, 0.01);
    }

}