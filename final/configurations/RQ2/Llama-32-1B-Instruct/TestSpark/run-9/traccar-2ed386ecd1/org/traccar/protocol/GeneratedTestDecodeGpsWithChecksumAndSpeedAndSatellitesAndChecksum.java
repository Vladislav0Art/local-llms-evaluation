package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksum {

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksum() {
        ByteBuf buf = Unpooled.buffer(18);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(18, buf.readUnsignedInt());
    }

}