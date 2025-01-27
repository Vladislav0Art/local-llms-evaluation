package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenValidBuffer_ReturnsPosition {

    @Test
    public void decodeGps_GivenValidBuffer_ReturnsPosition() {
        ByteBuf buf = Unpooled.copiedBuffer(1, 2);
        Position position = new Position();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, null));
    }

}