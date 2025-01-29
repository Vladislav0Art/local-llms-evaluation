package org.traccar.protocol;

public class GeneratedTest {

    private Protocol protocol;

    @Test
    public void testDecodeGpsPosition() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, true, false, false, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, true, false, false, TimeZone.getDefault()).getLatitude());
    }

    @Test
    public void testDecodeGpsPositionNoSatellites() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, true, false, true, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, true, false, true, TimeZone.getDefault()).getLatitude());
    }

    @Test
    public void testDecodeGpsPositionSpeed() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, true, false, true, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, true, false, true, TimeZone.getDefault()).getLatitude());
    }

    @Test
    public void testDecodeGpsPositionTimezone() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, true, false, false, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, true, false, false, TimeZone.getDefault()).getTimestamp());
    }

    @Test
    public void testDecodeGpsHasLength() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, false, true, false, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, false, true, false, TimeZone.getDefault()).getLatitude());
    }

    @Test
    public void testDecodeGpsHasSatellites() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, true, false, false, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, false, false, true, TimeZone.getDefault()).getLatitude());
    }

    @Test
    public void testDecodeGpsHasSpeed() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, true, false, true, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, true, true, false, TimeZone.getDefault()).getLatitude());
    }

    @Test
    public void testDecodeNetworkMessageNoDeviceSession() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        ByteBuf buf = Unpooled.buffer(10);
        // No device session present
    }

    @Test
    public void testDecodeGt06ProtocolDecode() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        String message = "1234567890";
        byte[] bytes = HexUtils.hexStringToBytes(message);
        ByteBuf buf = Unpooled.buffer(bytes.length / 2, StandardCharsets.UTF_8);
        decoder.decode(buf, null, true, false, false, TimeZone.getDefault());
    }

}