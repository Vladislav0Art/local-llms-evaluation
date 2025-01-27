package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

public class GeneratedDecode_WatchMessage_WithIndex_ReturnsCorrectDecode {

    @Test
    public void decode_WatchMessage_WithIndex_ReturnsCorrectDecode() throws Exception {
        // Given
        ByteBuf message = Unpooled.copiedBuffer("watch:1", StandardCharsets.UTF_8);
        DeviceSession session = Mockito.mock(DeviceSession.class);

        // When
        WatchProtocolDecoder decoder = new WatchProtocolDecoder(Protocol.WATCH_PROTOCOL);
        Object result = decoder.decode(null, new SocketAddress(), message);

        // Then
        assertEquals(session, result);
    }

}