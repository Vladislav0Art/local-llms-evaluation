package org.traccar.protocol;

public class GeneratedTestDecodeNoGps {

    private BaseProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeNoGps() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, false, false, TimeZone.UTC);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, false, false, TimeZone.UTC);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, false, false, TimeZone.UTC);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertFalse(hasSatellites);
        Assert.assertTrue(hasSpeed);
    }

}