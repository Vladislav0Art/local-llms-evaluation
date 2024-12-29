package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestDecodePositionFromMessage {

    @Test
    public void testDecodePositionFromMessage() throws Exception {
        // Arrange
        byte[] message = new byte[50];
        BufferUtil.writeByte(message, 0);
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        Object result = Gt06ProtocolDecoder.Gt06ProtocolDecoder.decodePositionFromMessage(message, position);

        // Assert
        assertNotNull(result);
    }

}