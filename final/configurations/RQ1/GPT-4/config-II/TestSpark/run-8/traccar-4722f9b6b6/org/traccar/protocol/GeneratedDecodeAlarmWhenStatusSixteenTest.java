package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarmWhenStatusSixteenTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeAlarmWhenStatusSixteenTest() {
        assertEquals(Position.ALARM_SOS, decodeAlarm(16));
    }

}