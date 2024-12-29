package org.traccar.protocol;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class GeneratedTestDecodeGt06ProtocolPacket {

    @Test
    public void testDecodeGt06ProtocolPacket() throws Exception {
        // Arrange
        byte[] buffer = new byte[1000];
        for (int i = 2; i < buffer.length; i++) {
            BufferUtil.writeByte(buffer, i);
        }
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        boolean hasLength = true;
        TimeZone timezone = TimeZone.UTC;

        Gt06ProtocolDecoder.Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder();
        Object result = decoder.decodeGt06ProtocolPacket(position, buffer, hasLength, timezone);

        // Assert
        assertNotNull(result);
    }

}