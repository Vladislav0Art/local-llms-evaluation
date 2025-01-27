package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;

public class GeneratedDecode_ValidMessage_ReturnsPosition {

    @Test
    public void decode_ValidMessage_ReturnsPosition() {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.copiedBuffer("12345", StandardCharsets.UTF_8);
        Object msg = Position.class;

        // When
        Object decoded = decoder.decode(null, null, msg);

        // Then
        assertTrue(decoded instanceof Position);
    }

}