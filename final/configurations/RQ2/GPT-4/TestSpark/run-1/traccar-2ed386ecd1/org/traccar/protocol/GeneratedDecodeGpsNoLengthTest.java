package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedDecodeGpsNoLengthTest {

    @Test
    public void decodeGpsNoLengthTest() {
        Position position = new Position();
        byte[] data = "Test String".getBytes(StandardCharsets.US_ASCII);
        ByteBuf message = Unpooled.wrappedBuffer(data);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, message, false, TimeZone.getDefault()));
    }

}