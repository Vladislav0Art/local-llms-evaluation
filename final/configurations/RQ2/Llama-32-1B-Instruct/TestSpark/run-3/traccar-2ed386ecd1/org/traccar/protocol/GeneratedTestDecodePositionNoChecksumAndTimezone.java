package org.traccar.protocol;

public class GeneratedTestDecodePositionNoChecksumAndTimezone {

    @Test
    public void testDecodePositionNoChecksumAndTimezone() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertFalse(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, true, ZoneId.of("UTC")));
    }

}