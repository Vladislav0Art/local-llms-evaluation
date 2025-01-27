package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenInvalidXml_ReturnsFalse {

    @Test
    public void decodeGps_GivenInvalidXml_ReturnsFalse() {
        assertFalse(Gt06ProtocolDecoder.decodeGps(null, Unpooled.copiedBuffer(LENGTH, 2), true, null));
    }
}

}