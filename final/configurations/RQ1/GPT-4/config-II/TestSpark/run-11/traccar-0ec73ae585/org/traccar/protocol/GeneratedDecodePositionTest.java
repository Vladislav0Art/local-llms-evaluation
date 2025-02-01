package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.*;

import java.lang.reflect.Method;

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        DeviceSession deviceSession = mock(DeviceSession.class);
        when(deviceSession.getDeviceId()).thenReturn(1L);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Method decodePosition = WatchProtocolDecoder.class.getDeclaredMethod("decodePosition", DeviceSession.class, String.class);
        decodePosition.setAccessible(true);

        final String data = "050521,183445,A,2234.5872,N,11401.5087,E,0.00,0.0,0.0,11,99,100,0,x,0,10,3,460,1,1000,2000,-60,1001,2001,-70,cn_WIFI_0001,cc:cc:cc:cc:cc:cc,-40,cn_WIFI_0002,dd:dd:dd:dd:dd:dd,-50";

        Position position = (Position) decodePosition.invoke(decoder, deviceSession, data);

        Assert.assertEquals((long) 1, (long) position.getDeviceId());
        Assert.assertEquals(true, position.getValid());
        Assert.assertEquals(22.576453333333334, position.getLatitude(), 0);
        Assert.assertEquals(114.025145, position.getLongitude(), 0);
        Assert.assertEquals(0, position.getSpeed(), 0);
        Assert.assertEquals(0, position.getCourse(), 0);
        Assert.assertEquals(0, position.getAltitude(), 0);
        Assert.assertEquals(11, position.getInteger(Position.KEY_SATELLITES));
        Assert.assertEquals(99, position.getInteger(Position.KEY_RSSI));
        Assert.assertEquals(100, position.getInteger(Position.KEY_BATTERY_LEVEL));
        Assert.assertEquals(0, position.getInteger(Position.KEY_STEPS));
    }

}