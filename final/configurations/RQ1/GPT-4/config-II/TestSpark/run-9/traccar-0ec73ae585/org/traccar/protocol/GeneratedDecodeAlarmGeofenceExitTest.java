package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmGeofenceExitTest {

    @Test
    public void decodeAlarmGeofenceExitTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(1);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, result);
    }

}