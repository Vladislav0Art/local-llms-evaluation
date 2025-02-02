package net.e175.klaus.solarpositioning;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalcT_CurrentDate_ReturnsCorrectT {

    private Grena3 grena3;

    @Before
    public void setUp() {
        grena3 = new Grena3();
    }

    @Test
    public void calcT_CurrentDate_ReturnsCorrectT() {
        ZonedDateTime date = ZonedDateTime.now();
        double t = grena3.calcT(date);
        assertEquals(t, -0.41, 0.01);
    }
}

class AzimuthZenithAngle {
    private final double yaw;
    private final double elevation;

    public AzimuthZenithAngle(double yaw, double elevation) {
        this.yaw = yaw;
        this.elevation = elevation;
    }

    public double getElevation() {
        return elevation;
    }

    public double getYaw() {
        return yaw;
    }

}