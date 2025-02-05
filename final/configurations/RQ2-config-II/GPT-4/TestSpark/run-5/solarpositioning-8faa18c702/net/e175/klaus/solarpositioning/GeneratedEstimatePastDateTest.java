package net.e175.klaus.solarpositioning;

import net.e175.klaus.solarpositioning.DeltaT;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class GeneratedEstimatePastDateTest {

    @Test
    public void estimatePastDateTest() {
        //Arrange
        LocalDate pastDate = LocalDate.of(1940, 1, 1);
        //Act
        double estimatedDeltaT = DeltaT.estimate(pastDate);
        //Assert
        Assert.assertEquals(27.1, estimatedDeltaT, 0.1); // 0.1 is a delta that we set for float number comparison
    }

}