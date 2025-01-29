package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodeGps_Position() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;
        int expected = position.lat + position.lng * 3600;
        boolean hasSatellites = false;
        boolean hasSpeed = true;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, hasSatellites, hasSpeed));
    }

    @Test
    public void testDecodeGps_SingleByteBuf() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer(1);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;
        int expected = position.lat + position.lng * 3600;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, false, true));
    }

    @Test
    public void testDecodeGps_NoTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, false));
    }

    @Test
    public void testDecodeGps_NoChecksum() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSatellites() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, false));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeed() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellites() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSatellites() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeed() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSatellites() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeed() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeedAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeedAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeedAndTimestampAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeedAndTimestampAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeedAndTimestampAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeedAndTimestampAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

    @Test
    public void testDecodeGps_NoChecksumAndSpeedAndTimestampAndHasSatellitesAndHasSpeedAndTimestampAndHasSpeedAndTimestampAndTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, true));
    }

}