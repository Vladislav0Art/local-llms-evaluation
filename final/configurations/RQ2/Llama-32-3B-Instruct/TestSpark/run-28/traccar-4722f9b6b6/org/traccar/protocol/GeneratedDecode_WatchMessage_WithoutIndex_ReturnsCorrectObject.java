package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Date;

public class GeneratedDecode_WatchMessage_WithoutIndex_ReturnsCorrectObject {

    @Test
    public void decode_WatchMessage_WithoutIndex_ReturnsCorrectObject() throws Exception {
        // Arrange
        Object msg = Parser.build("Watch message without index", WatchProtocolDecoder.class);

        // Act
        Object decoded = new WatchProtocolDecoder(Protocol.WATCH).decode(null, null, msg);

        // Assert
        assertTrue(decoded instanceof WatchMessageWithoutIndex);
    }

}