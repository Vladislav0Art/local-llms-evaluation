package org.traccar.protocol;

public class GeneratedTestDecodeGpsPositionWithMessage {

    private static final String[] METHOD_UNTERS = {
            "decodeGps(Position, ByteBuf, boolean, TimeZone, TimeZone)",  // decodeGpsPosition
            "decodeGps(Position, ByteBuf, boolean, boolean, boolean, TimeZone)",  // decodeGpsPositionWithSatellitesAndSpeed
            "decodeGps(Position, ByteBuf, Object, boolean, TimeZone)"  // decodeGpsPositionWithMessage
    };

    private Gt06ProtocolDecoder protocolDecoder = new Gt06ProtocolDecoder(new Protocol());

    @Test
    public void testDecodeGpsPositionWithMessage() throws Exception {
        byte[] data = "01000000".getBytes(StandardCharsets.UTF_8);
        ByteBuf buf = Unpooled.buffer(data.length());
        buf.writeByte(0x10); // GPS packet header
        buf.writeShort(0x01); // Length of message in bytes
        buf.writeBoolean(true);
        buf.writeBoolean(false);
        buf.writeLong(123456789L);
        buf.writeChar('M');
        buf.writeByte(0x00);

        Position position = protocolDecoder.decode(buf, null, 0, true, false, StandardCharsets.UTF_8);

        assertEquals("01000000", new String(data));
    }

}