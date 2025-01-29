package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithoutSatellites {

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

}