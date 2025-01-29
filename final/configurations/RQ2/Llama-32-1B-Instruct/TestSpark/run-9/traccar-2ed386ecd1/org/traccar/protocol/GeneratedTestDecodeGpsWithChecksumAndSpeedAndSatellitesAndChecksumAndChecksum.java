package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksum {

    @Test
    public void testDecodeGpsWithChecksumAndSpeedAndSatellitesAndChecksumAndChecksum() {
        ByteBuf buf = Unpooled.buffer(19);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, true, null);

        assertEquals(19, buf.readUnsignedInt());
    }

}