package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithoutSpeed {

    @Test
    public void testDecodeGpsWithoutSpeed() throws Exception {
        // Arrange
        byte[] message = new byte[50];
        BufferUtil.writeByte(message, 0);
        Position position = new Position();
        position.setId(123L);
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        // Act
        Object result = Gt06ProtocolDecoder.Gt06ProtocolDecoder.decodeGpsWithoutSpeed(message, position, false);

        // Assert
        assertNotNull(result);
    }

}