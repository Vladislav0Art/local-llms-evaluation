package org.traccar.protocol;

public class GeneratedTestDecodePositionNoSpeed {

    @Test
    public void testDecodePositionNoSpeed() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, true, ZoneId.of("UTC")));
    }

}