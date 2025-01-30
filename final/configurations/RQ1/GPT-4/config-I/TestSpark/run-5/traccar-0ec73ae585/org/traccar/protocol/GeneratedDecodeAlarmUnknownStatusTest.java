package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTester;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedDecodeAlarmUnknownStatusTest {

    @Test
    public void decodeAlarmUnknownStatusTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        assertNull(decoder.decodeAlarm(100));
    }

}