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

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedDecodeExceptionScenarioTest {

    @Mock
    Protocol protocol;

    @Mock
    Channel channel;

    @Test
    public void decodeExceptionScenarioTest() {
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("localhost", 8080));
        ByteBuf msg = Unpooled.copiedBuffer("010203040506", StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        decoder.decode(channel, new InetSocketAddress("localhost", 8080), msg);
    }

}