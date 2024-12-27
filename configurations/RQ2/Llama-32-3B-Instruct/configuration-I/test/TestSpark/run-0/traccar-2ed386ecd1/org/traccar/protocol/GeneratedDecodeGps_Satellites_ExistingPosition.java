package org.traccar.protocol;

public class GeneratedDecodeGps_Satellites_ExistingPosition {

    @Test
    public void decodeGps_Satellites_ExistingPosition() {
        // Arrange
        Position position = new Position(1, 2);
        ByteBuf buf = mock(ByteBuf.class);
        boolean hasLength = true;
        boolean hasSatellites = false;
        TimeZone timezone = mock(TimeZone.class);

        // Act and Assert
        when(timezone.getId()).thenReturn("UTC");
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, hasLength, hasSatellites, false));
    }

}