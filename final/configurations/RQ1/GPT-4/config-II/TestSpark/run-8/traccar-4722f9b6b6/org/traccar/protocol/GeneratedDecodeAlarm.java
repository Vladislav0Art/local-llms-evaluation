package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarm {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeAlarm() {
        assertEquals(Position.ALARM_REMOVING, decodeAlarm(20));
        assertEquals(Position.ALARM_FALL_DOWN, decodeAlarm(21));
        assertEquals(Position.ALARM_FALL_DOWN, decodeAlarm(22));
    }

}