package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmGeofenceEnterTest {

    @Test
    public void decodeAlarmGeofenceEnterTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(2);
        assertEquals(Position.ALARM_GEOFENCE_ENTER, result);
    }

}