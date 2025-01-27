package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

public class GeneratedDecode_WatchMessageWithId_ReturnsCorrectDecode {

    public WatchProtocolDecoder getDecoder() {
        return new WatchProtocolDecoder();
    }

    @Test
    public void decode_WatchMessageWithId_ReturnsCorrectDecode() throws Exception {
        // Given
        ByteBuf message = io.netty.buffer.Unpooled.copiedBuffer("watch:1", java.nio.charset.StandardCharsets.UTF_8);
        WatchProtocolDecoder decoder = getDecoder();

        // When
        Object result = decoder.decode(message);

        // Then
        assertEquals(1, result);
    }

}