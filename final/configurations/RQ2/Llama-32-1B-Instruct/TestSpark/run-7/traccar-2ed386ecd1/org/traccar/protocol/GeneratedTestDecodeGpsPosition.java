package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition {

    @Test
    public void testDecodeGpsPosition() {
        // Arrange
        Position position = new Position(37.7749, -122.4194);
        ByteBuf buf = Unpooled.buffer(10);

        // Act
        boolean result = Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, TimeZone.getTimeZone("America/Los_Angeles"));

        // Assert
        assertEquals(true, result);
    }

}