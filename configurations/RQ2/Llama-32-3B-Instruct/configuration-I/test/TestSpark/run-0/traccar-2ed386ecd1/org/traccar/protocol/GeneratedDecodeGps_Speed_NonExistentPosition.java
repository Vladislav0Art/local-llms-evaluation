package org.traccar.protocol;

public class GeneratedDecodeGps_Speed_NonExistentPosition {

    @Test
    public void decodeGps_Speed_NonExistentPosition() {
        // Arrange
        Position position = null;
        ByteBuf buf = mock(ByteBuf.class);
        boolean hasLength = true;
        boolean hasSpeed = false;
        TimeZone timezone = mock(TimeZone.class);

        // Act and Assert
        when(timezone.getId()).thenReturn("UTC");
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, false, hasSpeed));
    }

}