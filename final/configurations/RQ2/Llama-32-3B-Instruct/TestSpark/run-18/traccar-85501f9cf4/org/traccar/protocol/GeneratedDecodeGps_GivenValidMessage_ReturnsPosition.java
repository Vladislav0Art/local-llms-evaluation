package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

public class GeneratedDecodeGps_GivenValidMessage_ReturnsPosition {

    @Test
    public void decodeGps_GivenValidMessage_ReturnsPosition() {
        Object msg = null;
        assertTrue(Gt06ProtocolDecoder.decode(new Channel(), new SocketAddress(), msg));
    }

}