package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.Assert;
import org.mockito.Mock;

import static org.mockito.Mockito.when;

import org.mockito.Mockito;

import java.time.LocalDate;

public class GeneratedEstimateDifferentYearsTest {

    @Test
    public void estimateDifferentYearsTest() {
        LocalDate date1 = LocalDate.of(2000, 1, 1);
        LocalDate date2 = LocalDate.of(2020, 1, 1);
        Assert.assertNotEquals(DeltaT.estimate(date1), DeltaT.estimate(date2));
    }

}