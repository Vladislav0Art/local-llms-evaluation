package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedDecodePosition_ReturnsNullTest {

    @Test
    public void decodePosition_ReturnsNullTest() {
        // Arrange
        Object msg = null;

        // Act
        assertNull(Gt06ProtocolDecoder.decode(msg, null, null));

        // Assert
        assertNotNull(msg);
    }

}