package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;
import org.junit.Test;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(0b100));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(0b10));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0b1));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(0b100000000000000));
        assertNull(decoder.decodeAlarm(0));
    }

}