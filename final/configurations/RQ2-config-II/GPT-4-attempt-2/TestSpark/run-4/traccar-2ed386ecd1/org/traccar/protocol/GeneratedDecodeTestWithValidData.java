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

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeTestWithValidData {

    private final Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));

    @Mock
    private Channel channel;

    private ByteBuf buf(String data) {
        return Unpooled.copiedBuffer(data.getBytes(StandardCharsets.ISO_8859_1));
    }

    @Test
    public void decodeTestWithValidData() throws Exception {
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("localhost", 5005));
        assertNotNull(decoder.decode(channel, null, buf("78781f120f0a0b10060701cc027ac4003a38010d0a")));
    }

}