package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;

import java.nio.charset.StandardCharsets;

public class GeneratedDecodeGps_Position_WithEmptyBuffer_ThrowsException {

    @Test
    public void decodeGps_Position_WithEmptyBuffer_ThrowsException() {
        Position position = new Position();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, null, false, false, false, null));
    }

}