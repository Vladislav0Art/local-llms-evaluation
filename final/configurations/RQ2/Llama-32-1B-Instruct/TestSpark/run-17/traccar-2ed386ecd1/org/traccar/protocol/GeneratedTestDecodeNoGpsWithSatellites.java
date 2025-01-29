package org.traccar.protocol;

public class GeneratedTestDecodeNoGpsWithSatellites {

    private BaseProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeNoGpsWithSatellites() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data and satellites

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, true, false, TimeZone.UTC);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, true, false, TimeZone.UTC);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, true, false, TimeZone.UTC);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertFalse(hasSpeed);
    }

}