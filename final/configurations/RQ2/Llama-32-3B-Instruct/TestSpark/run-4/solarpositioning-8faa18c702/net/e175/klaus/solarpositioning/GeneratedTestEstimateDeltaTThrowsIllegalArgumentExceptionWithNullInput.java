package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.core.IsNot.is;

import java.time.LocalDate;

public class GeneratedTestEstimateDeltaTThrowsIllegalArgumentExceptionWithNullInput {

    @Test
    public void testEstimateDeltaTThrowsIllegalArgumentExceptionWithNullInput() {
        LocalDate forDate = null;
        boolean thrown = false;
        try {
            DeltaT.estimate(forDate);
            throw new AssertionError("Expected exception not thrown");
        } catch (Exception e) {
            thrown = true;
        }
        assertFalse(thrown);
    }

}