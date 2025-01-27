package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import org.traccar.protocol.WatchProtocolDecoder;
import org.traccar.protocol.BaseProtocolDecoder;
import org.traccar.model.Position;
import io.netty.buffer.ByteBuf;

public class GeneratedDecode_InvalidMessage_ReturnsNull {

    @Test
    public void decode_InvalidMessage_ReturnsNull() {
        // Given
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH);
        ByteBuf buf = Unpooled.copiedBuffer("12345", StandardCharsets.UTF_8);
        Object msg = DeviceSession.class;

        // When
        Object decoded = decoder.decode(null, null, msg);

        // Then
        assertNull(decoded);
    }

}