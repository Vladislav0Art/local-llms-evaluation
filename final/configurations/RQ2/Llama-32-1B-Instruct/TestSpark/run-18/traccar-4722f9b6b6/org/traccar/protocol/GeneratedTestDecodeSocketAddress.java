package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import java.nio.charset.StandardCharsets;

import io.netty.buffer.ByteBuf;

public class GeneratedTestDecodeSocketAddress {

    @Test
    public void testDecodeSocketAddress() {
        // Arrange
        When(channel).isDead().thenReturn(false);
        When(remoteAddress).isDead().thenReturn(true);

        // Act
        assertFalse(decoder.decode(channel, remoteAddress, msg));
    }

}