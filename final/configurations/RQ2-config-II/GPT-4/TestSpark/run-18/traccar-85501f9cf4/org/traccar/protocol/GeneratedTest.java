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
public class GeneratedTest {

    @Mock
    Protocol protocol;

    @Mock
    Channel channel;

    @Test
    public void decodeGpsNoLengthTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("01020304", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());
        // make assertions here
        assertTrue(result);
    }

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("0102030405", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());
        // make assertions here
        assertTrue(result);
    }

    @Test
    public void decodeGpsAllParametersTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("010203040506", StandardCharsets.UTF_8);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        // make assertions here
        assertTrue(result);
    }

    @Test
    public void decodeExceptionScenarioTest() {
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("localhost", 8080));
        ByteBuf msg = Unpooled.copiedBuffer("010203040506", StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        decoder.decode(channel, new InetSocketAddress("localhost", 8080), msg);
    }

    @Test
    public void decodeTest() {
        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("localhost", 8080));
        ByteBuf msg = Unpooled.copiedBuffer("01", StandardCharsets.UTF_8);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Object result = decoder.decode(channel, new InetSocketAddress("localhost", 8080), msg);
        // make assertions here
    }

}