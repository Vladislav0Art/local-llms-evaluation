package org.traccar.protocol;

public class GeneratedTestDecodeGps_SingleByteBuf {

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

}