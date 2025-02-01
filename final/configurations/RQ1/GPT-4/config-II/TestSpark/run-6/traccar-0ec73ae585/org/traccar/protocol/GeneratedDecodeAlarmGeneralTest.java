package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;
import org.traccar.session.DeviceSession;

import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GeneratedDecodeAlarmGeneralTest {

    @Test
    public void decodeAlarmGeneralTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("watch"));
        assertEquals(Position.ALARM_GEOFENCE_EXIT, decoder.decodeAlarm(1));
        assertEquals(Position.ALARM_GEOFENCE_ENTER, decoder.decodeAlarm(2));
        assertEquals(Position.ALARM_POWER_CUT, decoder.decodeAlarm(16384));
        assertEquals(Position.ALARM_SOS, decoder.decodeAlarm(65536));
        assertNull(decoder.decodeAlarm(9999)); // This scenario tests 'No alarm'
    }

}