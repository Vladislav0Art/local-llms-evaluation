package org.traccar.protocol;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.junit.Test;
import org.traccar.Protocol;
import org.traccar.model.Position;

import java.util.TimeZone;

import static org.junit.Assert.*;

public class GeneratedTest {

    @Test
    public void Gt06ProtocolDecoderConstructorTest() {
        Protocol protocol = new Protocol("gt06") {
        };
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        assertNotNull(decoder);
    }

    @Test
    public void decodeGpsWithoutLengthAndTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("testdata".getBytes());
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, null));
    }

    @Test
    public void decodeGpsWithLengthAndWithoutTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("testdata".getBytes());
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

    @Test
    public void decodeGpsWithoutLengthAndWithTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("testdata".getBytes());
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsWithLengthAndWithTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("testdata".getBytes());
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsAllFlasgWithTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("testdata".getBytes());
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, true, true, true, TimeZone.getDefault()));
    }

    @Test
    public void decodeGpsNoFlasgWithTimeZoneTest() {
        Position position = new Position();
        ByteBuf buf = Unpooled.wrappedBuffer("testdata".getBytes());
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, TimeZone.getDefault()));
    }

}