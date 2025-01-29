package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksum {

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(20);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(20, buf.readUnsignedInt());
    }

}