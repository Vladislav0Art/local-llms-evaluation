package org.traccar.protocol;

public class GeneratedDecodeGps_Speed_ExistingPosition {

    @Test
    public void decodeGps_Speed_ExistingPosition() {
        // Arrange
        Position position = new Position(1, 2);
        ByteBuf buf = mock(ByteBuf.class);
        boolean hasLength = true;
        boolean hasSpeed = false;
        TimeZone timezone = mock(TimeZone.class);

        // Act and Assert
        when(timezone.getId()).thenReturn("UTC");
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false, hasSpeed));
    }

}