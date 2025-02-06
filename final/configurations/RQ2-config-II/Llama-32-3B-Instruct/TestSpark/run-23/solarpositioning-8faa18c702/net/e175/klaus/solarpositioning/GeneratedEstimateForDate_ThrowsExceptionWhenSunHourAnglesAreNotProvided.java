package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimateForDate_ThrowsExceptionWhenSunHourAnglesAreNotProvided {

    @Mock
    private List<Double> sunHourAngleList;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimateForDate_ThrowsExceptionWhenSunHourAnglesAreNotProvided() {
        when(sunHourAngleList).thenReturn(null);

        assertThrows(NullPointerException.class, deltaT::estimate);
    }

}