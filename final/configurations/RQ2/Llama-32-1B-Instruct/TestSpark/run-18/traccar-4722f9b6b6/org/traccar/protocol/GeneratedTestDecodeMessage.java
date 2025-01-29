package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;

public class GeneratedTestDecodeMessage {

    @Test
    public void testDecodeMessage() {
        // Arrange
        when(channel()).thenReturn(null);
        when(remoteAddress()).thenReturn(null);
        when(msg()).thenReturn(new Network());

        // Act
        decoder.decode(channel, remoteAddress, msg);

        // Assert
        assertTrue(decoder instanceof WatchProtocolDecoder);
    }

}