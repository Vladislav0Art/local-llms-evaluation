package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenInvalidDate_ReturnsFalse {

    @Test
    public void decodeGps_GivenInvalidDate_ReturnsFalse() {
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, Unpooled.copiedBuffer(1, 2), true, null));
    }
}

}