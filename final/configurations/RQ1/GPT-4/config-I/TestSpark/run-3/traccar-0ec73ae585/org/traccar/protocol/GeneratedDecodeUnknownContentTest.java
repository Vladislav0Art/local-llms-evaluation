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

public class GeneratedDecodeUnknownContentTest {

    @Test
    public void decodeUnknownContentTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(protocol);

        Channel channel = Mockito.mock(Channel.class);
        ByteBuf buffer = Unpooled.copiedBuffer("[3G*1234567890*00EF*INIT]", StandardCharsets.US_ASCII);

        WatchProtocolDecoder spy = Mockito.spy(decoder);
        Mockito.doReturn(null).when(spy).getDeviceSession(any(), any(), any());

        Object decoded = spy.decode(channel, InetSocketAddress.createUnresolved("localhost", 0), buffer);

        assertEquals(null, decoded);
    }

}