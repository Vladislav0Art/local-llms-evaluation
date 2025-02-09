package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedEstimateMethodReturnsZeroForNullInput {

    public static final LocalDate FOR_DATE = LocalDate.of(2022, 1, 15);

    @Mock
    private LocalDate mockForDate;

    @Test
    public void estimateMethodReturnsZeroForNullInput() {
        when(mockForDate).thenReturn(null);
        assertEquals(DeltaT.estimateForNull(FOR_DATE), 0);
    }

}