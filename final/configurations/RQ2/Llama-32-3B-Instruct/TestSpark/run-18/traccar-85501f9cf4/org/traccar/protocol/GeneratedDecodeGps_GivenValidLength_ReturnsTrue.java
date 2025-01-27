package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenValidLength_ReturnsTrue {

    @Test
    public void decodeGps_GivenValidLength_ReturnsTrue() {
        ByteBuf buf = Unpooled.copiedBuffer(LENGTH, 2);
        assertTrue(Gt06ProtocolDecoder.decodeGps(null, buf, true, null));
    }

}