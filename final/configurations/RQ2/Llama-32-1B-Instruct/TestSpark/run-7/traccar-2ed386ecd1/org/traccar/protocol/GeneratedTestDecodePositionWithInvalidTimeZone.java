package org.traccar.protocol;

public class GeneratedTestDecodePositionWithInvalidTimeZone {

    @Test
    public void testDecodePositionWithInvalidTimeZone() {
        // Arrange
        Position position = new Position(-1, -2);

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), true, false, true, TimeZone.getTimeZone("Invalid"));

        // Assert
        assertEquals(false, result);
    }

}