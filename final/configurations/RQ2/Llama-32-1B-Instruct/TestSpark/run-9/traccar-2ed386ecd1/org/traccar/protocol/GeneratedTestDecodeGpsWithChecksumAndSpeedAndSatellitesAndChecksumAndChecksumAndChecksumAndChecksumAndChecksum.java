package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum {

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksumAndChecksumAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(22);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(22, buf.readUnsignedInt());
    }

}