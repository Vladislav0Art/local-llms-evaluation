package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.helper.UnitsConverter;
import org.traccar.model.Position;
import org.traccar.model.WifiAccessPoint;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.mockito.Mockito.*;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0x1));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(0x2));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(0x4));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(0x4000));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(0x10000));
        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0x20000));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(0x40000));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(0x80000));
        assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(0x100000));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(0x200000));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(0x400000));
        assertNull(decoder.decodeAlarm(0x0));
    }

}