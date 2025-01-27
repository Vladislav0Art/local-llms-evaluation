package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Date;

public class GeneratedDecodeGpsPositionOnlyTest {

    @Test
    public void decodeGpsPositionOnlyTest() {
        Position position = new Position();
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

}