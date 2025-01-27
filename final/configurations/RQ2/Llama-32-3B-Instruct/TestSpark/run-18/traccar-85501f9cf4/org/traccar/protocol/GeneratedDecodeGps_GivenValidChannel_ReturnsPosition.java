package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenValidChannel_ReturnsPosition {

    @Test
    public void decodeGps_GivenValidChannel_ReturnsPosition() {
        Channel channel = new Channel();
        assertTrue(Gt06ProtocolDecoder.decode(null, channel, Unpooled.copiedBuffer(LENGTH, 2)));
    }

}