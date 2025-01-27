package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodeGpsPosition {

    @Test
    public void decodeGpsPosition() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);
        byte[] buf = DecoderUtil.getMockBuffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone);
        assertTrue(result);
    }

}