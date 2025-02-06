package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.MatcherscloseTo;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(PowerMockRunner.class)
public class GeneratedEstimateInvalidDate {

    DeltaT .class,LocalDate .class
})

public class DeltaTTest {

    @Mock
    private LocalDate forDate;

    @Mock
    private LocalDate referenceDate;

    public DeltaT deltaT = new DeltaT();

    @Test
    public void estimateInvalidDate() {
        when(forDate.toEpochDay()).thenReturn(Double.NaN);
        try {
            deltaT.estimate(forDate);
            org.junit.runner.JUnitCore.main("net.e175.klaus.solarpositioning.DeltaT");
        } catch (Exception e) {
            // expected exception
        }
    }

}