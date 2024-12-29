package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;

import java.net.InetSocketAddress;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeEmptyMessageTest {

    @Test
    public void decodeEmptyMessageTest() throws Exception {
        GalileoProtocol protocol = new GalileoProtocol();
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);

        ByteBuf byteBuf = Unpooled.wrappedBuffer(new byte[0]);
        Object result = decoder.decode(null, null, byteBuf);

        assertNull(result);
    }

}