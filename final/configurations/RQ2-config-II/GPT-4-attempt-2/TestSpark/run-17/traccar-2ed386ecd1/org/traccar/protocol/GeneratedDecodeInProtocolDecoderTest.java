package org.traccar.protocol;

import org.junit.Test;
import org.junit.Assert;

import static org.mockito.Mockito.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import org.traccar.Protocol;
import org.traccar.model.Position;

public class GeneratedDecodeInProtocolDecoderTest {

    @Test
    public void decodeInProtocolDecoderTest() throws Exception {
        ByteBuf buf = Unpooled.copiedBuffer("0101010101", StandardCharsets.UTF_8);

        Protocol protocol = mock(Protocol.class);
        Channel channel = mock(Channel.class);
        InetSocketAddress remoteAddress = new InetSocketAddress("localhost", 12345);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        decoder.decode(channel, remoteAddress, buf);

        Assert.assertTrue(true);
    }

}