package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.traccar.Protocol;
import org.traccar.helper.UnitsConverter;
import org.junit.Test;
import org.mockito.Mockito;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);
        Channel channel = mock(Channel.class);
        SocketAddress remoteAddress = mock(SocketAddress.class);
        ByteBuf byteBuf = Unpooled.copiedBuffer("testData", StandardCharsets.UTF_8);
        Object result = decoder.decode(channel, remoteAddress, byteBuf);
        assertNotNull(result);
        Mockito.verify(channel, Mockito.times(1)).remoteAddress();
    }

}