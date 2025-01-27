package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(JUnit4Runner.class)
public class GeneratedEstimate_DatesAtBeginningOfYear {

    @Mock
    private LocalDate forDate;

    @Mock
    private static double defaultDeltaT;

    public DeltaTTest() {
        MockitoAnnotations.initMocks(this);
        when(forDate.getYear()).thenReturn(2022);
        when(forDate.getMonthValue()).thenReturn(1);
        when(forDate.getDayOfMonth()).thenReturn(1);
        when(defaultDeltaT).thenReturn(9.8696);
    }

    @Test
    public void estimate_DatesAtBeginningOfYear() {
        // Arrange
        LocalDate date = LocalDate.of(2022, 1, 31);

        // Act
        double deltaT = DeltaT.estimate(date);

        // Assert
        assertTrue(deltaT == defaultDeltaT || deltaT > defaultDeltaT);
    }

}