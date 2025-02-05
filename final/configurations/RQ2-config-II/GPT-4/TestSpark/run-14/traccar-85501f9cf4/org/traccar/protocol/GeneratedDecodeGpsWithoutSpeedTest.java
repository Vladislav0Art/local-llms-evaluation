package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;

import static org.junit.Assert.*;

import io.netty.buffer.Unpooled;
import org.traccar.Protocol;

public class GeneratedDecodeGpsWithoutSpeedTest {

    @Test
    public void decodeGpsWithoutSpeedTest() {
        Position position = new Position();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        boolean result = decoder.decodeGps(position, Unpooled.buffer(12), true, true, true, TimeZone.getDefault());
        assertTrue(result);
    }

}