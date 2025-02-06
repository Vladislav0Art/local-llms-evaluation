package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedEstimate_CrossesLeapSecondsReturnsCorrectValue {

    @Mock
    private LocalDate forDate;

    @Test
    public void estimate_CrossesLeapSecondsReturnsCorrectValue() {
        when(forDate.atDay(60)).thenReturn(LocalDate.of(1970, 2, 2));
        assertEquals(-24, DeltaT.estimate(forDate), 0.001);
    }

}