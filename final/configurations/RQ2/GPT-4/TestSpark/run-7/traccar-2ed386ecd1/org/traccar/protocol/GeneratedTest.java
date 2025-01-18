package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.net.SocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private Protocol protocol;

    @Mock
    private SocketAddress address;

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeGpsHasLengthTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("010203040506", StandardCharsets.UTF_8);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsNoLengthTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("010203040506", StandardCharsets.UTF_8);
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsAdvancedTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.copiedBuffer("010203040506", StandardCharsets.UTF_8);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf msg = Unpooled.copiedBuffer("010203040506", StandardCharsets.UTF_8);
        assertNotNull(decoder.decode(null, address, msg));
    }

}