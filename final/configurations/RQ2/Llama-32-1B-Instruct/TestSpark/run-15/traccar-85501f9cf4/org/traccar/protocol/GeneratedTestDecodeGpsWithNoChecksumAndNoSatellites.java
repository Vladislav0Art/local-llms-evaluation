package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithNoChecksumAndNoSatellites {

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

}