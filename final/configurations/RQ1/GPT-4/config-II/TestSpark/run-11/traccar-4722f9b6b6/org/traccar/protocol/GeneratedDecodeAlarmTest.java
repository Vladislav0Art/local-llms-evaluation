package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.Date;

import static org.junit.Assert.*;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        Protocol protocol = new Protocol("test");
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(0b0000000000000001));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(0b0000000000000010));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(0b0000000000000100));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(0b0100000000000000));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(0b1000000000000000));
        assertNull(decoder.decodeAlarm(0b0000000000000000));
    }

}