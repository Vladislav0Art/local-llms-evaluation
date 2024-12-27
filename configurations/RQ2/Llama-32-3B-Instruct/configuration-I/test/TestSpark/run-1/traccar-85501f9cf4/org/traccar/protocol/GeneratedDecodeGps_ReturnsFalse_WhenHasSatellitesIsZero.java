package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GeneratedDecodeGps_ReturnsFalse_WhenHasSatellitesIsZero {

    @Test
    public void decodeGps_ReturnsFalse_WhenHasSatellitesIsZero() {
        Position position = new Position(0, 0);
        ByteBuf buf = ByteBuffer.allocate(1);
        boolean hasLength = true;
        boolean hasSatellites = false;
        TimeZone timezone = new TimeZone();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, false, timezone));
    }

}