package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenInvalidLength_ReturnsFalse {

    @Test
    public void decodeGps_GivenInvalidLength_ReturnsFalse() {
        ByteBuf buf = Unpooled.copiedBuffer(LENGTH + 1, 2);
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, buf, true, null));
    }
}

}