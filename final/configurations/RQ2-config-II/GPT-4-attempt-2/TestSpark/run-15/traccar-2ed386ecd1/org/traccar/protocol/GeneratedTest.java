package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void Gt06ProtocolDecoderInitTest() {
        Protocol protocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Assert.assertNotNull(decoder);
    }

    @Test
    public void decodeGpsLengthAndTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("any raw bytes".getBytes(StandardCharsets.UTF_8));

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getTimeZone("UTC"));
        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsWithoutLengthAndTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("any raw bytes".getBytes(StandardCharsets.UTF_8));

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getTimeZone("UTC"));
        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsDetailedTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("any raw bytes".getBytes(StandardCharsets.UTF_8));

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getTimeZone("UTC"));
        Assert.assertTrue(result);
    }

    @Test
    public void decodeGpsDetailedWithoutTimezoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("any raw bytes".getBytes(StandardCharsets.UTF_8));

        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, false, null);
        Assert.assertTrue(result);
    }

    @Test
    public void decodeTest() throws Exception {
        Protocol protocol = Mockito.mock(Protocol.class);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object object = new Object();

        Object result = decoder.decode(null, remoteAddress, object);
        Assert.assertNull(result);
    }

}