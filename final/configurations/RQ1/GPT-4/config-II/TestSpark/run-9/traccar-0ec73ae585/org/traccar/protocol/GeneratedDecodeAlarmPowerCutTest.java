package org.traccar.protocol;

import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.Properties;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmPowerCutTest {

    @Test
    public void decodeAlarmPowerCutTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("testProtocol", new Properties()));

        String result = decoder.decodeAlarm(14);
        assertEquals(Position.ALARM_POWER_CUT, result);
    }

}