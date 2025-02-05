package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;

import static org.junit.Assert.*;

import io.netty.buffer.Unpooled;
import org.traccar.Protocol;

public class GeneratedTest {

    @Test
    public void decodeGpsWithNoLengthTest() {
        Position position = new Position();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        boolean result = decoder.decodeGps(position, Unpooled.buffer(0), false, TimeZone.getDefault());
        assertFalse(result);
    }

    @Test
    public void decodeGpsWithLengthTest() {
        Position position = new Position();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        boolean result = decoder.decodeGps(position, Unpooled.buffer(12), true, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeGpsWithSpeedTest() {
        Position position = new Position();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        boolean result = decoder.decodeGps(position, Unpooled.buffer(12), true, true, false, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeGpsWithoutSpeedTest() {
        Position position = new Position();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        boolean result = decoder.decodeGps(position, Unpooled.buffer(12), true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

    @Test
    public void decodeWithoutChannelTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        decoder.decode(null, null, "invalid msg");
    }

    @Test
    public void decodeWithInvalidMsgTest() throws Exception {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        decoder.decode(null, null, new Object());
    }

}