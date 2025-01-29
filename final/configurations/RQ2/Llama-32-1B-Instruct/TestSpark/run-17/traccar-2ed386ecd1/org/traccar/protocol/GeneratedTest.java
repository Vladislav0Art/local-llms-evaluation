package org.traccar.protocol;

public class GeneratedTest {

    private BaseProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.Gt06);

    @Test
    public void testDecodeGps() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);
        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for GPS data

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, false, false, TimeZone.UTC);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, false, false, TimeZone.UTC);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, false, false, TimeZone.UTC);

        // Then
        Assert.assertTrue(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertFalse(hasSpeed);
    }

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

    @Test
    public void testDecodeNoGpsWithSpeed() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data and speed

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, false, true, TimeZone.UTC);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, false, true, TimeZone.UTC);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, false, true, TimeZone.UTC);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertTrue(hasSpeed);
    }

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

    @Test
    public void testDecodeNoTimezone() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, false, false, TimeZone.NETWORKTIME);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, false, false, TimeZone.NETWORKTIME);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, false, false, TimeZone.NETWORKTIME);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertFalse(hasSatellites);
        Assert.assertFalse(hasSpeed);
    }

    @Test
    public void testDecodeNoTimezoneWithHasLength() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data and length

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, true, false, TimeZone.NETWORKTIME);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, true, false, TimeZone.NETWORKTIME);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, true, false, TimeZone.NETWORKTIME);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertFalse(hasSpeed);
    }

    @Test
    public void testDecodeNoTimezoneWithHasSatellites() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data and satellites

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, true, false, TimeZone.NETWORKTIME);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, true, true, TimeZone.NETWORKTIME);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, true, false, TimeZone.NETWORKTIME);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertFalse(hasSpeed);
    }

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

    @Test
    public void testDecodeNoTimezoneWithHasSpeedAndSatellites() {
        // Given
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);

        ByteBuf buf = Unpooled.buffer(6); // Assuming 6 bytes for no GPS data, speed and satellites

        // When
        boolean hasLength = decoder.decodeGps(position, buf, false, true, true, TimeZone.NETWORKTIME);
        boolean hasSatellites = decoder.decodeGps(position, buf, false, true, true, TimeZone.NETWORKTIME);
        boolean hasSpeed = decoder.decodeGps(position, buf, false, true, true, TimeZone.NETWORKTIME);

        // Then
        Assert.assertFalse(hasLength);
        Assert.assertTrue(hasSatellites);
        Assert.assertTrue(hasSpeed);
    }

}