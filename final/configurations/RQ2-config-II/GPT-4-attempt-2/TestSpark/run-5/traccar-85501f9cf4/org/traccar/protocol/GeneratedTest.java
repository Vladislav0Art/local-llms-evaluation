package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Context;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private Channel channel;

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertTrue(decoder instanceof Gt06ProtocolDecoder);
    }

    @Test
    public void decodeGpsTestWithTimeZone() {
        ByteBuf buf = Unpooled.wrappedBuffer("Testing Decoding".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());

        assertTrue(result);
    }

    @Test
    public void decodeGpsTestWithSatellitesAndSpeed() {
        ByteBuf buf = Unpooled.wrappedBuffer("Testing Decoding".getBytes(StandardCharsets.UTF_8));
        Position position = new Position();

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());

        assertTrue(result);
    }

    @Test
    public void decodeTest() {
        ByteBuf buf = Unpooled.wrappedBuffer("Testing Decoding".getBytes(StandardCharsets.UTF_8));

        when(channel.remoteAddress()).thenReturn(new InetSocketAddress("127.0.0.1", 8000));

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);

        Object decodedObject = decoder.decode(channel, new InetSocketAddress("127.0.0.1", 8000), buf);
        assertEquals(decodedObject.getClass(), Position.class);
    }

}