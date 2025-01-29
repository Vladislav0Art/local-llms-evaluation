package org.traccar.protocol;

public class GeneratedTestDecodeGpsWithChecksum {

    @Test
    public void testDecodeGpsWithChecksum() {
        ByteBuf buf = Unpooled.buffer(13);
        Position position = new Position();
        position.setLatitude("37.7749");
        position.setLongitude("-122.4194");

        Protocol protocol = new Gt06ProtocolDecoder(new Protocol());
        ProtocolResult result = protocol.decode(position, buf, true, false, false, null);

        assertEquals(13, buf.readUnsignedInt());
    }

}