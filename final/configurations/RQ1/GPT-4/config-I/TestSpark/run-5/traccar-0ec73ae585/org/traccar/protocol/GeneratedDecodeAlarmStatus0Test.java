package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTester;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedDecodeAlarmStatus0Test {

    @Test
    public void decodeAlarmStatus0Test() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0));
    }

}