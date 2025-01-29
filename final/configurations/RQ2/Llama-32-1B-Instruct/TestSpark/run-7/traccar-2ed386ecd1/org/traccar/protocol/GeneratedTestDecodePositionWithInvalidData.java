package org.traccar.protocol;

public class GeneratedTestDecodePositionWithInvalidData {

    @Test
    public void testDecodePositionWithInvalidData() {
        // Arrange
        Position position = new Position(-1, -2);

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, Unpooled.buffer(10), false, true, true, TimeZone.getTimeZone("America/New_York"));

        // Assert
        assertEquals(false, result);
    }

}