package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Date;

public class GeneratedDecodeGpsPositionWithSpeedTest {

    @Test
    public void decodeGpsPositionWithSpeedTest() {
        Position position = new Position();
        double speed = 100.0;
        position.setSpeed(speed);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

}