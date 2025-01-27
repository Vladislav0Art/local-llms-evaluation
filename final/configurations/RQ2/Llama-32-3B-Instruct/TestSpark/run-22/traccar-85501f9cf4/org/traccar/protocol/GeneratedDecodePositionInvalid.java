package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;

public class GeneratedDecodePositionInvalid {

    @Test
    public void decodePositionInvalid() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        Position position = new Position();
        byte[] buf = DecoderUtil.getMockBuffer();
        boolean hasLength = true;
        TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
        boolean result = Gt06ProtocolDecoder.decodePosition(position, buf, hasLength, false, timezone);
        assertFalse(result);
    }
}

class DecoderUtil {
    public static byte[] getMockBuffer() {
        return Unpooled.buffer(10).writeBytes(new byte[]{1, 2, 3});
    }

}