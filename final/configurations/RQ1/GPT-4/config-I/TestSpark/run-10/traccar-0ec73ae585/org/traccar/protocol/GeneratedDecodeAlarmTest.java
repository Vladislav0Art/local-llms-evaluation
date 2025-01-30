package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;
import org.traccar.protocol.PositionManager;
import org.traccar.network.NetworkManager;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.nio.charset.StandardCharsets;

import io.netty.channel.Channel;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class GeneratedDecodeAlarmTest {

    private WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);

    @Test
    public void decodeAlarmTest() {
        int status = 16;
        String alarm = decoder.decodeAlarm(status);

        assertEquals(Position.ALARM_SOS, alarm);
    }

}