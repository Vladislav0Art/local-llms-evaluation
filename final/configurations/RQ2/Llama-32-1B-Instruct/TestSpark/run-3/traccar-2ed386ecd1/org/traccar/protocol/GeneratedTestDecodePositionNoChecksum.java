package org.traccar.protocol;

public class GeneratedTestDecodePositionNoChecksum {

    @Test
    public void testDecodePositionNoChecksum() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, false, false, true));
    }

}