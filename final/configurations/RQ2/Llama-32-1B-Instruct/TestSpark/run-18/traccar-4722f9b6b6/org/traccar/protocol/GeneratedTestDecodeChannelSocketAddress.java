package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;

public class GeneratedTestDecodeChannelSocketAddress {

    @Test
    public void testDecodeChannelSocketAddress() {
        // Arrange
        When(channel).isDead().thenReturn(false);
        When(remoteAddress).isDead().thenReturn(false);

        // Act
        assertTrue(decoder.decode(channel, remoteAddress, msg));
    }

}