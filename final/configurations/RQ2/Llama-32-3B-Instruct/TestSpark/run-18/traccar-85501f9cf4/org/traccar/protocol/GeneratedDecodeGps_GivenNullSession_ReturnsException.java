package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenNullSession_ReturnsException {

    @Test
    public void decodeGps_GivenNullSession_ReturnsException() {
        DeviceSession session = null;
        try {
            Gt06ProtocolDecoder.decode(session, new Channel(), Unpooled.copiedBuffer(LENGTH, 2));
            fail("Expected exception");
        } catch (Exception e) {
            // expected
        }
    }

}