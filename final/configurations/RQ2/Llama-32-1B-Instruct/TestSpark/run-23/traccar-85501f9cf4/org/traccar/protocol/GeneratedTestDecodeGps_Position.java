package org.traccar.protocol;

public class GeneratedTestDecodeGps_Position {

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

}