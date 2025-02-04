package net.e175.klaus.solarpositioning;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.time.ZonedDateTime;
import java.util.Random;

import net.e175.klaus.solarpositioning.AzimuthZenithAngle;
import net.e175.klaus.solarpositioning.Grena3;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalcT_ReturnsCorrectValue {

    @Mock
    private AzimuthZenithAngle az;
    @Mock
    private ZoneOffset zone;

    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void calcT_ReturnsCorrectValue() {
        // Arrange
        final ZonedDateTime date = ZonedDateTime.of(2022, 1, 1, 12, 30, 0, 500, ZoneOffset.UTC);

        // Act
        double t = Grena3.calcT(date);

        // Assert
        assertEquals(-24001.5d, t);
    }

}