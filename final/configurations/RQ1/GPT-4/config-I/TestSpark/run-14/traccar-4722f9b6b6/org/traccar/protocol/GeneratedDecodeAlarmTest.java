package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = Mockito.mock(WatchProtocolDecoder.class, Mockito.CALLS_REAL_METHODS);
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(14));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(16));
        assertNull(decoder.decodeAlarm(50));
    }

}