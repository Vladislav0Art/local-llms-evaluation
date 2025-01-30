package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Session;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmGeofenceEnterTest {

    @Test
    public void decodeAlarmGeofenceEnterTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        String result = decoder.decodeAlarm(2);
        assertEquals(result, Position.ALARM_GEOFENCE_ENTER);
    }

}