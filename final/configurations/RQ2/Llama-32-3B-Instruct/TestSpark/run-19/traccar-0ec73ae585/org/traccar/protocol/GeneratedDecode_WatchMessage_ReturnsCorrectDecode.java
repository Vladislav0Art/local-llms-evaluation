package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.net.SocketAddress;

import io.netty.buffer.ByteBuf;
import org.mockito.Mockito;

public class GeneratedDecode_WatchMessage_ReturnsCorrectDecode {

    public WatchProtocolDecoder getDecoder() {
        return new WatchProtocolDecoder();
    }

    @Test
    public void decode_WatchMessage_ReturnsCorrectDecode() throws Exception {
        // Given
        ByteBuf message = io.netty.buffer.Unpooled.copiedBuffer("watch", java.nio.charset.StandardCharsets.UTF_8);
        WatchProtocolDecoder decoder = getDecoder();

        // When
        Object result = decoder.decode(message);

        // Then
        assertNotNull(result);
    }

}