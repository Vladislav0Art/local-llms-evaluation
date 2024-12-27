package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedDecodeGps_ReturnsTrue_WhenHasAllParameters {

    @Test
    public void decodeGps_ReturnsTrue_WhenHasAllParameters() {
        Position position = new Position(0, 0);
        ByteBuf buf = ByteBuffer.allocate(1);
        boolean hasLength = true;
        boolean hasSatellites = true;
        boolean hasSpeed = true;
        TimeZone timezone = new TimeZone();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, timezone));
    }

}