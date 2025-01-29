package org.traccar.protocol;

public class GeneratedTestDecodePositionNoSatellites {

    @Test
    public void testDecodePositionNoSatellites() {
        Position position = new Position(0, 0, 100000, 200000, "ATN", "1234567890");
        ByteBuf buf = Unpooled.buffer();
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, ZoneId.of("UTC")));
    }

}