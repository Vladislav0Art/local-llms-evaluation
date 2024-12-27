package org.traccar.protocol;

public class GeneratedDecodeGps_GreenwichMeridian_Gt06Protocol_ExistingPosition {

    @Test
    public void decodeGps_GreenwichMeridian_Gt06Protocol_ExistingPosition() {
        // Arrange
        Position position = new Position(0, 2);
        ByteBuf buf = mock(ByteBuf.class);
        boolean hasLength = true;
        TimeZone timezone = mock(TimeZone.class);

        // Act and Assert
        when(timezone.getId()).thenReturn("UTC");
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, timezone));
    }

}