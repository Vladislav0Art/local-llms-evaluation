package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodePosition() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, ZoneId.of("UTC")));
    }

    @Test
    public void testDecodePositionNoLength() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, ZoneId.of("UTC")));
    }

    @Test
    public void testDecodePositionNoSatellites() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, ZoneId.of("UTC")));
    }

    @Test
    public void testDecodePositionNoSpeed() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, true, ZoneId.of("UTC")));
    }

    @Test
    public void testDecodePositionNoTimezone() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, true, TimeZone.NONE));
    }

    @Test
    public void testDecodePositionNoChecksum() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndNoLength() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellites() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSpeed() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndTimezone() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, ZoneId.of("UTC")));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndTimezone() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, ZoneId.of("UTC")));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeed() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezone() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, ZoneId.of("UTC")));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksum() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLength() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestamp() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitude() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitude() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitude() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitudeAndHeading() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitudeAndHeadingAndQuality() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitudeAndHeadingAndQualityAndMode() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitudeAndHeadingAndQualityAndModeAndFrequency() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

    @Test
    public void testDecodePositionNoChecksumAndSatellitesAndSpeedAndTimezoneAndChecksumAndLengthAndTimestampAndLongitudeAndLatitudeAndAltitudeAndHeadingAndQualityAndModeAndFrequencyAndPrecision() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, true));
    }

}