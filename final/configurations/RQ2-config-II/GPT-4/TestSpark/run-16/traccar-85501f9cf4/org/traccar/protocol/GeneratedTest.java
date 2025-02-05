package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.Channel;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

public class GeneratedTest {

    @Test
    public void decodeGpsWithLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Position position = new Position("gt06");
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes("890123456789012345".getBytes(StandardCharsets.ISO_8859_1));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault());
        assertTrue("Expected true but was false", result);
    }

    @Test
    public void decodeGpsWithoutLengthTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Position position = new Position("gt06");
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes("890123456789012345".getBytes(StandardCharsets.ISO_8859_1));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault());
        assertTrue("Expected true but was false", result);
    }

    @Test
    public void decodeGpsWithParametersTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        Position position = new Position("gt06");
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes("890123456789012345".getBytes(StandardCharsets.ISO_8859_1));
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault());
        assertTrue("Expected true but was false", result);
    }

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        ByteBuf buf = Unpooled.buffer();
        buf.writeBytes("890123456789012345".getBytes(StandardCharsets.ISO_8859_1));
        Channel channel = Mockito.mock(Channel.class);
        SocketAddress remoteAddress = Mockito.mock(SocketAddress.class);
        Object decodedObject = decoder.decode(channel, remoteAddress, buf.array());
        assertNotNull("Decoded object should not be null", decodedObject);
    }

}