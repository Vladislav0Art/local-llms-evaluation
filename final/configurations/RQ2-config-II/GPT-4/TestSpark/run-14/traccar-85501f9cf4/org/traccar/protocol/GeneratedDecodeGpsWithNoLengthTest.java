package org.traccar.protocol;

import org.junit.Test;
import org.traccar.model.Position;

import static org.junit.Assert.*;

import io.netty.buffer.Unpooled;
import org.traccar.Protocol;

public class GeneratedDecodeGpsWithNoLengthTest {

    @Test
    public void decodeGpsWithNoLengthTest() {
        Position position = new Position();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol("gt06"));
        boolean result = decoder.decodeGps(position, Unpooled.buffer(0), false, TimeZone.getDefault());
        assertFalse(result);
    }

}