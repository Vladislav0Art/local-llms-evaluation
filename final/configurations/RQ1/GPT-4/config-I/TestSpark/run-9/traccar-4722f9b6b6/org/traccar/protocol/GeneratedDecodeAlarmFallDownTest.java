package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Session;
import org.traccar.model.Position;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmFallDownTest {

    @Test
    public void decodeAlarmFallDownTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        String result = decoder.decodeAlarm(21);
        assertEquals(result, Position.ALARM_FALL_DOWN);
    }

}