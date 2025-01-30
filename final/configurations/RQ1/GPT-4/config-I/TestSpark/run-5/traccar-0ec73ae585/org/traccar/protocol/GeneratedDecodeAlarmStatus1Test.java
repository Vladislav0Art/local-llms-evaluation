package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTester;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedDecodeAlarmStatus1Test {

    @Test
    public void decodeAlarmStatus1Test() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(1));
    }

}