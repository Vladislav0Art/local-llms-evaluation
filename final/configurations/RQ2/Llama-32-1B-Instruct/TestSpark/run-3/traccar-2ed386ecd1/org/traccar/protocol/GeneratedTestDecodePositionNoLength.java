package org.traccar.protocol;

public class GeneratedTestDecodePositionNoLength {

    @Test
    public void testDecodePositionNoLength() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, true, false, false, ZoneId.of("UTC")));
    }

}