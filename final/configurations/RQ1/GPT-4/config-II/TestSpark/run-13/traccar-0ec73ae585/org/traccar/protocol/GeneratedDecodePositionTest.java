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

public class GeneratedDecodePositionTest {

    @Test
    public void decodePositionTest() {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol("name"));
        DeviceSession deviceSession = new DeviceSession(1);

        String data = "010101,000000,V,0.0,N,0.0,E,0.0,0.0,0.0,0,0,10,10,0,0000,";
        Position position = decoder.decodePosition(deviceSession, data);

        assertNotNull(position);
        assertTrue(position.getValid());
        assertEquals(10, position.getInteger(Position.KEY_BATTERY_LEVEL).intValue());
        assertEquals(10, position.getInteger(Position.KEY_STEPS).intValue());
    }

}