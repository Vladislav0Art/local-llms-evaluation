package org.traccar.protocol;

import org.junit.Test;
import org.traccar.DatabaseManager;
import org.traccar.GlobalContext;
import org.traccar.model.Position;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Protocol;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmTest {

    private final WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch", 0, false, false, null));

    @Test
    public void decodeAlarmTest() {
        assertNull(decoder.decodeAlarm(5));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(18));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(22));
    }

}