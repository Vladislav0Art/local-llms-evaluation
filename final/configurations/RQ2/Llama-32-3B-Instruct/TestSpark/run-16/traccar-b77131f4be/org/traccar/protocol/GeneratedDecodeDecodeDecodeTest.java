package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.net.SocketAddress;

public class GeneratedDecodeDecodeDecodeTest {

    @Test
    public void decodeDecodeDecodeTest() throws Exception {
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Unpooled.buffer(10).slice();
        Object msg = Unpooled.buffer(20).slice();

        byte[] data = {0x02, 0x01, 0x00, 0x09, 0x02};
        ByteBuf decodedMessage = GalileoProtocolDecoder.decode(channel, remoteAddress, msg);
        assertEquals(data, decodedMessage.array());
    }

}