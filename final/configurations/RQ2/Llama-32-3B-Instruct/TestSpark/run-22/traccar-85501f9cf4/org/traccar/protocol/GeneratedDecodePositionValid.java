package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodePositionValid {

    @Test
    public void decodePositionValid() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);
        byte[] buf = DecoderUtil.getMockBuffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        Gt06ProtocolDecoder.decodePosition(position, buf, hasLength, timezone);
    }

}