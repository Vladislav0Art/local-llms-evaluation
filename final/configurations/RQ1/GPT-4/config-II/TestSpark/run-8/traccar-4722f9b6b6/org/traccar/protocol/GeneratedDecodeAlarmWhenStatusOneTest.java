package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarmWhenStatusOneTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeAlarmWhenStatusOneTest() {
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decodeAlarm(1));
    }

}