package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.Model.Protocol;
import org.traccar.Model.Position;

public class GeneratedDecodeAlarmLowBatteryAlarmTest {

    @Test
    public void decodeAlarmLowBatteryAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("protocol"));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(1));
    }

}