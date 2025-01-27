package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodeGpsPositionNoSpeed {

    @Test
    public void decodeGpsPositionNoSpeed() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);
        byte[] buf = DecoderUtil.getMockBuffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        boolean hasSatellites = true;
        boolean hasSpeed = false;
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, hasSpeed, timezone);
        assertFalse(result);
    }

}