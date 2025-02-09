package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.helper.BufferUtil;
import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.session.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeWhenNonByteBufferPayloadTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeWhenNonByteBufferPayloadTest() throws Exception {
        Object payload = new Object();
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        Object result = decoder.decode(channel, remoteAddress, payload);
        assertEquals(payload, result);
    }

}