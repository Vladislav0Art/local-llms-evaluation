package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarmWhenStatusEighteenTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeAlarmWhenStatusEighteenTest() {
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decodeAlarm(18));
    }

}