package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.SocketAddress;
import java.util.Date;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmTest {

    @Test
    public void decodeAlarmTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));

        assertEquals(Position.ALARM_LOW_BATTERY, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(4));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(16384));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(65536));
        assertEquals(Position.ALARM_REMOVING, decoder.decodeAlarm(1048576));
        assertEquals(Position.ALARM_FALL_DOWN, decoder.decodeAlarm(2097152));
        assertEquals(null, decoder.decodeAlarm(0));
    }

}