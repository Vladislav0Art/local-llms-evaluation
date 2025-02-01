package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarmWhenStatusTwoTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeAlarmWhenStatusTwoTest() {
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decodeAlarm(2));
    }

}