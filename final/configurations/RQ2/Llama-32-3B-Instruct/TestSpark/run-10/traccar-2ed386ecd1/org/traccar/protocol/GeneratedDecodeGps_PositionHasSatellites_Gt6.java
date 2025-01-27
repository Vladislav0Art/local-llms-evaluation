package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.TimeZone;

public class GeneratedDecodeGps_PositionHasSatellites_Gt6 {

    @Test
    public void decodeGps_PositionHasSatellites_Gt6() {
        Position position = new Position();
        ByteBuf buf = Unpooled.buffer(10);
        boolean hasLength = true;
        boolean hasSatellites = false;
        TimeZone timezone = TimeZones.GMT;
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, false, timezone));
    }

}