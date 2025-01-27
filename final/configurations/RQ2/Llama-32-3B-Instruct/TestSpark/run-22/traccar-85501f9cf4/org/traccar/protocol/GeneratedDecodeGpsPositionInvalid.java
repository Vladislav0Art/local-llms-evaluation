package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodeGpsPositionInvalid {

    @Test
    public void decodeGpsPositionInvalid() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position();
        byte[] buf = DecoderUtil.getMockBuffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false, false, false, timezone);
        assertFalse(result);
    }

}