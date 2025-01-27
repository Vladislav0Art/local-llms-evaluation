package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.Date;

public class GeneratedDecodeGpsPositionWithSatellitesTest {

    @Test
    public void decodeGpsPositionWithSatellitesTest() {
        Position position = new Position();
        int satellites = 12;
        position.setSatellites(satellites);
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, null);
        assertTrue(result);
    }

}