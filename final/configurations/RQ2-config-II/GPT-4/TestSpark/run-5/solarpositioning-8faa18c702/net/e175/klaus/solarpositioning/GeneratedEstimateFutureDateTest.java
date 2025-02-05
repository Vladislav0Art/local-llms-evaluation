package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimateFutureDateTest {

    @Test
    public void estimateFutureDateTest() {
        //Arrange
        LocalDate futureDate = LocalDate.of(2025, 1, 1);
        //Act
        double estimatedDeltaT = DeltaT.estimate(futureDate);
        //Assert
        Assert.assertEquals(73.3, estimatedDeltaT, 0.1); // 0.1 is a delta that we set for float number comparison
    }

}