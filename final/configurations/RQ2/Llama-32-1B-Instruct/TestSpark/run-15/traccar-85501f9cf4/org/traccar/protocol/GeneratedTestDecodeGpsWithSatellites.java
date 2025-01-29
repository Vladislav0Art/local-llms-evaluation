package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithSatellites {

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

}