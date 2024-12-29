package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestDecodeGpsPosition {

    @Test
    public void testDecodeGpsPosition() throws Exception {
        // Arrange
        byte[] expected = new byte[54];
        BufferUtil.writeByte(expected, 0);
        BufferUtil.writeByte(expected, 2);
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        boolean hasLength = true;
        TimeZone timezone = TimeZone.UTC;

        Gt06ProtocolDecoder.Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Object result = decoder.decodeGpsPosition(position, expected, hasLength, timezone);

        // Assert
        assertNotNull(result);
    }

}