package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum {

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(25);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(25, buf.readUnsignedInt());
    }

}