package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmBatteryLowTest {

    @Test
    public void decodeAlarmBatteryLowTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(0);
        assertEquals(Position.ALARM_LOW_BATTERY, result);
    }

}