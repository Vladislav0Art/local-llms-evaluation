package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.nio.charset.StandardCharsets;
import java.util.TimeZone;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    Protocol protocol;

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeGpsWithHasLengthTest() {
        ByteBuf buffer = Unpooled.copiedBuffer("010101", StandardCharsets.UTF_8);
        Position position = new Position();

        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buffer, true, TimeZone.getDefault()));
        assertFalse(buffer.isReadable());
    }

    @Test
    public void decodeGpsWithoutHasLengthTest() {
        ByteBuf buffer = Unpooled.copiedBuffer("010101", StandardCharsets.UTF_8);
        Position position = new Position();

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buffer, false, TimeZone.getDefault()));
        assertTrue(buffer.isReadable());
    }

    @Test
    public void decodeGpsWithSpeedAndSatellitesTest() {
        ByteBuf buffer = Unpooled.copiedBuffer("010101", StandardCharsets.UTF_8);
        Position position = new Position();

        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buffer, true, true, true, TimeZone.getDefault()));
        assertFalse(buffer.isReadable());
    }

    @Test
    public void decodeGpsWithoutSpeedAndSatellitesTest() {
        ByteBuf buffer = Unpooled.copiedBuffer("010101", StandardCharsets.UTF_8);
        Positions position = new Position();

        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buffer, true, false, false, TimeZone.getDefault()));
        assertTrue(buffer.isReadable());
    }

    @Test
    public void decodeTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buffer = Unpooled.copiedBuffer("010101", StandardCharsets.UTF_8);

        assertNull(decoder.decode(null, null, buffer.array()));
    }

}