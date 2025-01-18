package org.traccar.protocol;

import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;

import java.net.SocketAddress;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedTest {

    private Protocol protocol = mock(Protocol.class);
    private Channel channel = mock(Channel.class);
    private SocketAddress remoteAddress = mock(SocketAddress.class);

    @Test
    public void GalileoProtocolDecoderCreationTest() {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeWithNullMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object result = decoder.decode(channel, remoteAddress, null);
        assertEquals(null, result);
    }

    @Test
    public void decodeWithMockMsgTest() throws Exception {
        GalileoProtocolDecoder decoder = new GalileoProtocolDecoder(protocol);
        Object msg = Mockito.mock(Object.class);
        Object result = decoder.decode(channel, remoteAddress, msg);
        assertEquals(msg, result);
    }

}