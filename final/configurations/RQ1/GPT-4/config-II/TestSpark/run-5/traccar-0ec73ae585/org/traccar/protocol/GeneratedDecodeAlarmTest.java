package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.traccar.model.Position;

import java.net.SocketAddress;

public class GeneratedDecodeAlarmTest {

    private WatchProtocolDecoder decoder =
            new WatchProtocolDecoder(Protocol.getInstance("WATCH", "watch", null));

    @Test
    public void decodeAlarmTest() {
        Position position;
        position = decoder.decodeAlarm(0);
        assertEquals(Position.ALARM_LOW_BATTERY, position.getAlarm());
        position = decoder.decodeAlarm(1);
        assertEquals(Position.ALARM_GEOFENCE_EXIT, position.getAlarm());
    }

}