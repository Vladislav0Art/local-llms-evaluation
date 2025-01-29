package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithChecksumAndSatellitesAndSpeed {

    @Test
    public void testDecodeGpsWithChecksumAndSatellitesAndSpeed() {
        ByteBuf buf = Unpooled.buffer(16);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(16, buf.readUnsignedInt());
    }

}