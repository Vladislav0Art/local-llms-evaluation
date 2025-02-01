package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class GeneratedDecodeAlarmTest {

    private Protocol protocol = new Protocol();
    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

    @Test
    public void decodeAlarmTest() {
        int status = 1;
        String result = decoder.decodeAlarm(status);
        assertEquals(Position.ALARM_LOW_BATTERY, result);

        status = 2;
        result = decoder.decodeAlarm(status);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, result);
    }

}