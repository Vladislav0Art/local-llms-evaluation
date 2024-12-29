package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeMessageWithoutChannelTest {

    @Test
    public void decodeMessageWithoutChannelTest() throws Exception {
        GalileoProtocol protocol = new GalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        InetSocketAddress address = new InetSocketAddress("localhost", 8080);

        byte[] message = {0, 39, 109, -65, -28, -125, 2, 0, 2, 16, 120, 20, -79, 65, 46, -46, 73, 107, 81, -68, -122};
        ByteBuf byteBuf = Unpooled.wrappedBuffer(message);

        Object result = decoder.decode(null, address, byteBuf);

        assertNotNull(result);
    }

}