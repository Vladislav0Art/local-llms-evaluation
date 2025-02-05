package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.net.SocketAddress;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeValidBufferNoLengthTest {

    @Mock
    Protocol protocol;

    @Test
    public void decodeValidBufferNoLengthTest() {
        // Generating a Gps example buffer
        byte[] buffer = new byte[]{0x12, 0x34, 0x56, 0x78};
        Position position = new Position();

        // Decode the buffer and check the result
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.copiedBuffer(buffer), false, TimeZone.getDefault());
        assertTrue(result);
    }

}