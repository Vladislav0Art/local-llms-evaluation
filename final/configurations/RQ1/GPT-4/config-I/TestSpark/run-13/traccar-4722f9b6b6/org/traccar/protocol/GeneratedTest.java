package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Mock
    private SocketAddress remoteAddress;

    @Test
    public void decodeInitResponseTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("[EM*12345678*0026*INIT,080812,A,30.566340,N,114.036450,E,000.0,000,10,100,3]", StandardCharsets.US_ASCII);
        assertNull(decoder.decode(channel, remoteAddress, buf));

        verify(channel, times(1)).writeAndFlush(any());
    }

    @Test
    public void decodeDecodeUnknownTypeTest() throws Exception {
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.copiedBuffer("[EM*12345678*0026*UNKNOWN]", StandardCharsets.US_ASCII);
        assertNull(decoder.decode(channel, remoteAddress, buf));
    }

}