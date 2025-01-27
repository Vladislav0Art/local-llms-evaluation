package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.Gt06ProtocolDecoder;
import org.traccar.model.Position;

import java.nio.ByteBuffer;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

public class GeneratedDecode_Gt06PositionTest {

    @Test
    public void decode_Gt06PositionTest() {
        Object message = Gt06ProtocolDecoder.decode(
                null, null, "test message");
        assertNotNull(message);
    }

}