package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithSpeed {

    @Test
    public void testDecodeGpsWithSpeed() throws Exception {
        // Arrange
        byte[] message = new byte[50];
        BufferUtil.writeByte(message, 0);
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        Object result = Gt06ProtocolDecoder.Gt06ProtocolDecoder.decodeGpsWithSpeed(message, position, true);

        // Assert
        assertNotNull(result);
    }

}