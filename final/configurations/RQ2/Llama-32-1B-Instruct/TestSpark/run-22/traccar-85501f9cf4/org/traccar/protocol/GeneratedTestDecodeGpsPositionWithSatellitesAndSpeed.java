package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionWithSatellitesAndSpeed {

    private static final String[] METHOD_UNTERS = {
            "decodeGps(Position, ByteBuf, boolean, TimeZone, TimeZone)",  // decodeGpsPosition
            "decodeGps(Position, ByteBuf, boolean, boolean, boolean, TimeZone)",  // decodeGpsPositionWithSatellitesAndSpeed
            "decodeGps(Position, ByteBuf, Object, boolean, TimeZone)"  // decodeGpsPositionWithMessage
    };

    private Gt06ProtocolDecoder protocolDecoder = new Gt06ProtocolDecoder(new Protocol());

    @Test
    public void testDecodeGpsPositionWithSatellitesAndSpeed() throws Exception {
        byte[] data = "01000001".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(data.length());
        buf.writeByte(0x10); // GPS packet header
        buf.writeShort(0x02); // Length of message in bytes
        buf.writeBoolean(true);
        buf.writeBoolean(false);
        buf.writeLong(123456789L);
        buf.writeChar('S');
        buf.writeByte(0x00);

        Position position = protocolDecoder.decode(buf, null, 0, true, false, StandardCharsets.UTF_8);

        assertEquals("01000001", new String(data));
    }

}