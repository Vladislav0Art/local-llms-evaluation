package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;
import java.net.SocketAddress;

import io.netty.channel.Channel;

import static org.junit.Assert.*;

public class GeneratedDecodeGpsPostionBufferTest {

    @Test
    public void decodeGpsPostionBufferTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("Test Buffer".getBytes(StandardCharsets.UTF_8));
        TimeZone timezone = TimeZone.getDefault();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, timezone);
        assertTrue(result);
    }

}