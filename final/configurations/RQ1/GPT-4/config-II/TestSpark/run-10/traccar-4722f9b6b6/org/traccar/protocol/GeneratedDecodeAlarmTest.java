package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.traccar.Protocol;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol(""));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0));
        assertNull(decoder.decodeAlarm(24));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(21));
    }

}