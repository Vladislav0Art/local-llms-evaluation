package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.time.LocalDate;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.mockito.Mock;
import org.mockito.Mockito;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedEstimateThrowsNullPointerExceptionIfDateIsNull {

    @Test
    public void estimateThrowsNullPointerExceptionIfDateIsNull() {
        try {
            DeltaT.estimate(null);
            assert false;
        } catch (NullPointerException e) {
            assert true;
        }
    }

}