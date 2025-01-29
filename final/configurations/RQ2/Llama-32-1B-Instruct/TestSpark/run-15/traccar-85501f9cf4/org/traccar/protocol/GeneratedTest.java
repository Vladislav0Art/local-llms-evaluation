package org.traccar.protocol;

public class GeneratedTest {

    @Test
    public void testDecodeGpsWithoutSatellites() {
        ByteBuf buf = Unpooled.buffer(16);
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, timezone);
        assertEquals(false, decoder.hasResultPosition(position));
    }

    @Test
    public void testDecodeGpsWithSatellites() {
        ByteBuf buf = Unpooled.buffer(16 + 10); // 10 bytes for header and satellites
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, timezone);
        assertEquals(false, decoder.hasResultPosition(position));
    }

    @Test
    public void testDecodeGpsWithSpeed() {
        ByteBuf buf = Unpooled.buffer(16 + 10); // 10 bytes for header and satellites
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, true, Position.class);
        assertEquals(true, decoder.hasResultPosition(position));
    }

    @Test
    public void testDecodeGpsWithSatellitesAndSpeed() {
        ByteBuf buf = Unpooled.buffer(16 + 10); // 10 bytes for header and satellites
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, true, Position.class);
        assertEquals(true, decoder.hasResultPosition(position));
    }

    @Test
    public void testDecodeGpsWithNoChecksum() {
        ByteBuf buf = Unpooled.buffer(16 + 10); // 10 bytes for header and satellites
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = true;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, false, Position.class);
        assertEquals(true, decoder.hasResultPosition(position));
    }

    @Test
    public void testDecodeGpsWithChecksum() {
        ByteBuf buf = Unpooled.buffer(16 + 10); // 10 bytes for header and satellites
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = true;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, false, Position.class);
    }

    @Test
    public void testDecodeGpsWithNoChecksumAndNoSatellites() {
        ByteBuf buf = Unpooled.buffer(16); // 8 bytes for header and no satellites
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = true;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, false, Position.class);
    }

    @Test
    public void testDecodeGpsWithChecksumAndNoSatellites() {
        ByteBuf buf = Unpooled.buffer(16 + 8); // 18 bytes for header and satellites and checksum
        Position position = new Position();
        position.setLat(37.7749);
        position.setLon(-122.4194);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = true;
        TimeZone timezone = null;
        decoder.decode(buf, null, hasLength, false, Position.class);
    }

}