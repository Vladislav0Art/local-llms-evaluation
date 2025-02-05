package org.traccar.protocol;

import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.util.TimeZone;
import java.net.SocketAddress;

import io.netty.channel.Channel;

import static org.junit.Assert.*;

public class GeneratedDecodeTest {

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Mockito.mock(Protocol.class));
        Channel channelMock = Mockito.mock(Channel.class);
        SocketAddress addressMock = Mockito.mock(SocketAddress.class);
        ByteBuf buf = Unpooled.wrappedBuffer("Test Buffer".getBytes(StandardCharsets.UTF_8));
        Object result = decoder.decode(channelMock, addressMock, buf);
        assertNotNull(result);
    }

}