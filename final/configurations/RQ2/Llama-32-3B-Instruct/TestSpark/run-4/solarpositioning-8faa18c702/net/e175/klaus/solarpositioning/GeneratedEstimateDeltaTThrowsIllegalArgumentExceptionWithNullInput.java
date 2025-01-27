package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GeneratedEstimateDeltaTThrowsIllegalArgumentExceptionWithNullInput {

    @Test
    public void estimateDeltaTThrowsIllegalArgumentExceptionWithNullInput() {
        LocalDate forDate = null;
        assertThrows(IllegalArgumentException.class, () -> DeltaT.estimate(forDate));
    }

}