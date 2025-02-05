package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateEqualDatesTest {

    @Test
    public void estimateEqualDatesTest() {
        //Arrange
        LocalDate date1 = LocalDate.of(2022, 1, 1);
        LocalDate date2 = LocalDate.of(2022, 1, 1);
        //Act
        double estimatedDeltaT1 = DeltaT.estimate(date1);
        double estimatedDeltaT2 = DeltaT.estimate(date2);
        //Assert
        Assert.assertEquals(estimatedDeltaT1, estimatedDeltaT2, 0.0);
    }

}