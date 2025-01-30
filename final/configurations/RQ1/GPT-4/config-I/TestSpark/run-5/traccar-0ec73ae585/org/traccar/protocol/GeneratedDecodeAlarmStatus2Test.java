package org.traccar.protocol;

import org.junit.Test;
import org.traccar.ProtocolTester;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class GeneratedDecodeAlarmStatus2Test {

    @Test
    public void decodeAlarmStatus2Test() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(2));
    }

}