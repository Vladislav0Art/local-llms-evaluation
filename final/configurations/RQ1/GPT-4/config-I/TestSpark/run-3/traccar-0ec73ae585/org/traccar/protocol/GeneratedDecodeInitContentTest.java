package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class GeneratedDecodeInitContentTest {

    @Test
    public void decodeInitContentTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        when(channel.writeAndFlush(any())).thenReturn(null);

        ByteBuf buffer = Unpooled.copiedBuffer("[3G*1234567890*00EF*INIT]", StandardCharsets.US_ASCII);

        Object decoded = decoder.decode(channel, InetSocketAddress.createUnresolved("localhost", 0), buffer);

        assertEquals(null, decoded);
    }

}