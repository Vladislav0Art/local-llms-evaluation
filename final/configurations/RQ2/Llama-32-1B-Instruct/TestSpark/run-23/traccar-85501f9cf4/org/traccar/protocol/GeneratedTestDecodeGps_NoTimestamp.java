package org.traccar.protocol;

public class GeneratedTestDecodeGps_NoTimestamp {

    @Test
    public void testDecodeGps_NoTimestamp() throws Exception {
        Position position = new Position("01 02 03", "latitute: 10, longitude: 20");
        ByteBuf buf = Unpooled.buffer();
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        boolean hasLength = false;
        TimeZone timezone = null;

        assertTrue(decoder.decodeGps(position, buf, hasLength, timezone, true, false));
    }

}