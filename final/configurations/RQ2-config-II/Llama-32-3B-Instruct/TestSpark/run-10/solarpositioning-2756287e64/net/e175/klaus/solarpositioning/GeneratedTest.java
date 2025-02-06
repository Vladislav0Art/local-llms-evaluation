package net.e175.klaus.solarpositioning;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Random;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private ZonedDateTime date;

    @Mock
    private AzimuthZenithAngle angle;

    @Mock
    private Random random;

    public void setup() {
        when(date.getOffset()).thenReturn(ZoneOffset.UTC);
        when(random.nextDouble()).thenReturn(new Random().nextDouble());
        when(angle.getLatitude()).thenReturn(random.nextDouble());
        when(angle.getLongitude()).thenReturn(random.nextDouble());
    }

    @Test
    public void calculateSolarPosition_SingleInput_ReturnsAngle() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0);
        assertThat(result, not(nullValue()));
    }

    @Test
    public void calculateSolarPosition_SingleInput_ReturnsCorrectLatitude() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0);
        assertThat(result.getLatitude(), is(1.0));
    }

    @Test
    public void calculateSolarPosition_MultipleInput_ReturnsAngle() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0, 1000.0, 20.0);
        assertThat(result, not(nullValue()));
    }

    @Test
    public void calculateSolarPosition_MultipleInput_ReturnsCorrectLatitude() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0, 1000.0, 20.0);
        assertThat(result.getLatitude(), is(1.0));
    }

    @Test
    public void calculateSolarPosition_MultipleInput_ReturnsCorrectLongitude() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0, 1000.0, 20.0);
        assertThat(result.getLongitude(), is(2.0));
    }

    @Test
    public void calculateSolarPosition_MultipleInput_ReturnsCorrectDeltaT() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0, 1000.0, 20.0);
        assertThat(result.getDeltaT(), is(10.0));
    }

    @Test
    public void calculateSolarPosition_MultipleInput_ReturnsCorrectPressure() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0, 1000.0, 20.0);
        assertThat(result.getPressure(), is(1000.0));
    }

    @Test
    public void calculateSolarPosition_MultipleInput_ReturnsCorrectTemperature() {
        setup();
        Grena3 grena3 = new Grena3();
        AzimuthZenithAngle result = grena3.calculateSolarPosition(date, 1.0, 2.0, 10.0, 1000.0, 20.0);
        assertThat(result.getTemperature(), is(20.0));
    }

}