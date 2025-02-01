package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void decodePositionValidDataTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        Position result = decoder.decodePosition(new DeviceSession("testSession"),
                "230919,124530,A,-34.910494,S,138.573491,E,0,0,-19.5,12,43,81,5243,0,8f10,1,1,515,2,3558,1920,55,");
        assertNotNull(result);
        assertEquals(-34.91, result.getLatitude(), 0.001);
        assertEquals(138.57, result.getLongitude(), 0.001);
    }

    @Test
    public void decodePositionInvalidDataTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        Position result = decoder.decodePosition(new DeviceSession("testSession"), "invalidData");
        assertNull(result);
    }

    @Test
    public void decodeAlarmBatteryLowTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(0);
        assertEquals(Position.ALARM_LOW_BATTERY, result);
    }

    @Test
    public void decodeAlarmGeofenceExitTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(1);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, result);
    }

    @Test
    public void decodeAlarmGeofenceEnterTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(2);
        assertEquals(Position.ALARM_GEOFENCE_ENTER, result);
    }

    @Test
    public void decodeAlarmPowerCutTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(14);
        assertEquals(Position.ALARM_POWER_CUT, result);
    }

    @Test
    public void getManufacturerTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        decoder.decode(null, null, "testMessage".getBytes());
        assertEquals("te", decoder.getManufacturer());
    }

    @Test
    public void getHasIndexTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        decoder.decode(null, null, "testMessage".getBytes());
        assertFalse(decoder.getHasIndex());
    }

}