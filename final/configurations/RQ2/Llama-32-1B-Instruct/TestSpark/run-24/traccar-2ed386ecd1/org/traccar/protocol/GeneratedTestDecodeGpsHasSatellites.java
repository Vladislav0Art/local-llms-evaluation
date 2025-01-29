package org.traccar.protocol;

public class GeneratedTestDecodeGpsHasSatellites {

    private Protocol protocol;

    @Test
    public void testDecodeGpsHasSatellites() {
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(protocol);
        Position position = Position.builder()
                .latitude(37.7749)
                .longitude(-122.4194)
                .height(1000)
                .build();
        ByteBuf buf = Unpooled.buffer(10);
        decoder.decode(buf, null, true, false, false, TimeZone.getDefault());
        assertEquals("37.7749", decodeGps(position, buf, false, false, true, TimeZone.getDefault()).getLatitude());
    }

}