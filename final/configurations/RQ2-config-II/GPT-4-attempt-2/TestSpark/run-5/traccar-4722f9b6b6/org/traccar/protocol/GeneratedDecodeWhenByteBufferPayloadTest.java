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
public class GeneratedDecodeWhenByteBufferPayloadTest {

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeWhenByteBufferPayloadTest() throws Exception {
        byte[] data = "Some String".getBytes(StandardCharsets.UTF_8);
        ByteBuf byteBuf = Unpooled.wrappedBuffer(data);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(null);
        decoder.decode(channel, remoteAddress, byteBuf);

        byte[] expectedArray = new byte[byteBuf.capacity()];
        byteBuf.getBytes(0, expectedArray);
        assertEquals(expectedArray, data);
    }

}