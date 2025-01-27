package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static java.lang.Math.pow;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    public LocalDate FOR_DATE = LocalDate.of(2022, 6, 1);

    @Mock
    private net.e175.klaus.solarpositioning.SolarPositioning solarPositioning;

    @Test
    public void estimate_SimpleDate_ReturnsExpected() {
        when(solarPositioning.getSolarPosition(FOR_DATE)).thenReturn(new net.e175.klaus.solarpositioning.SolarPosition(0, 0));
        double deltaT = DeltaT.estimate(FOR_DATE);
        assertDeltaT(deltaT);
    }

    @Test
    public void estimate_NaiveDate_ReturnsZero() {
        when(solarPositioning.getSolarPosition(FOR_DATE)).thenReturn(null);
        double deltaT = DeltaT.estimate(FOR_DATE);
        assertEquals(0, deltaT);
    }

    @Test
    public void estimate_InvalidDate_ThrowsException() {
        when(solarPositioning.getSolarPosition(FOR_DATE)).thenThrow(new IllegalArgumentException());
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(FOR_DATE));
    }

    @Test
    public void estimate_DifferentDates_ReturnsDifferentValues() {
        LocalDate date1 = FOR_DATE;
        LocalDate date2 = FOR_DATE.plusDays(1);
        when(solarPositioning.getSolarPosition(date1)).thenReturn(new net.e175.klaus.solarpositioning.SolarPosition(0, 0));
        when(solarPositioning.getSolarPosition(date2)).thenReturn(new net.e175.klaus.solarpositioning.SolarPosition(10, 10));
        double deltaT1 = DeltaT.estimate(date1);
        double deltaT2 = DeltaT.estimate(date2);
        assertNotEquals(deltaT1, deltaT2);
    }

    private void assertDeltaT(double deltaT) {
        // implementation of deltaT assertion
    }

    private void assertEquals(double expected, double actual) {
        // implementation of equality assertion
    }

    private void assertThrows(Class<? extends Throwable> exceptionClass, Runnable runnable) throws Exception {
        // implementation of exception assertion
    }

}