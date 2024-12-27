package org.traccar.protocol;

public class GeneratedDecodeGps_DecimalDegrees_Gt06Protocol_ExistingPosition_NonExistentTimezone {

    @Test
    public void decodeGps_DecimalDegrees_Gt06Protocol_ExistingPosition_NonExistentTimezone() {
        // Arrange
        Position position = new Position(1, 2);
        ByteBuf buf = mock(ByteBuf.class);
        boolean hasLength = true;
        TimeZone timezone = mock(TimeZone.class);

        // Act and Assert
        when(timezone.getId()).thenReturn("InvalidTimezone");
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone));
    }

}