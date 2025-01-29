package org.traccar.protocol;

public class GeneratedTestDecodeNoTimezoneWithHasSpeed {

    private BaseProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeNoTimezoneWithHasSpeed() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data and speed

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, true, false, TimeZone.NETWORKTIME);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, true, true, TimeZone.NETWORKTIME);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, true, false, TimeZone.NETWORKTIME);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertTrue(hasSpeed);
    }

}