package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.model.Command;
import org.traccar.protocol.WatchProtocolEncoder;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarmWhenStatusFourteenTest {

    private WatchProtocolDecoder decoder;

    @Test
    public void decodeAlarmWhenStatusFourteenTest() {
        assertEquals(Position.ALARM_POWER_CUT, decodeAlarm(14));
    }

}