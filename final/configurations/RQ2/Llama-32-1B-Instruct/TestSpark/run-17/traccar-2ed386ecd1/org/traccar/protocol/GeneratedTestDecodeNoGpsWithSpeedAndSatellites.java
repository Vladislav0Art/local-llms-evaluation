package org.traccar.protocol;

public class GeneratedTestDecodeNoGpsWithSpeedAndSatellites {

    private BaseProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeNoGpsWithSpeedAndSatellites() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data, speed and satellites

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, false, false, TimeZone.UTC);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, false, true, TimeZone.UTC);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, false, true, TimeZone.UTC);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertTrue(hasSpeed);
    }

}