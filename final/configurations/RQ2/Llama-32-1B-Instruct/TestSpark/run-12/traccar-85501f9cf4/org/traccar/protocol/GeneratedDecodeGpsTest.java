package org.traccar.protocol;

public class GeneratedDecodeGpsTest {

    @Test
    public void decodeGpsTest() {
        ByteBuf buf = new Unpooled().encode("1234567890");
        Position position = new Position();
        position.setLatitude(37.7749);
        position.setLongitude(-122.4194);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, null) == 1);

        position = new Position();
        position.setLatitude(37.78585);
        position.setLongitude(-122.4365);
        assertTrue(Gt06ProtocolDecoder.decodeGps(position, buf, false, true, false, null) == 2);

        buf.clear();
        assertFalse(Gt06ProtocolDecoder.decodeGps(new Position(), buf, false, true, false, null));
    }

}