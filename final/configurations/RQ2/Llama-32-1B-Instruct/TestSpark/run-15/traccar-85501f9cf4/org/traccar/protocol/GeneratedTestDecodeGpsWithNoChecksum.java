package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithNoChecksum {

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

}