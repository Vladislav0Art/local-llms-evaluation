package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarmWhenStatusZeroTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeAlarmWhenStatusZeroTest() {
        assertEquals(Position.ALARM_LOW_BATTERY, decodeAlarm(0));
    }

}