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
public class GeneratedEstimate_isNaN_forNullInput {

    @Mock
    private LocalDate forDate;

    @InjectMocks
    private DeltaT deltaT;

    @Test
    public void estimate_isNaN_forNullInput() {
        assertFalse(deltaT.estimate(null));
    }

}