package org.traccar.protocol;

public class GeneratedTestDecodeGpsNoChecksum {

    @Test
    public void testDecodeGpsNoChecksum() {
        Position position = new Position(37, 34);
        byte[] buffer = Unpooled.buffer().writeByte((byte) 0x01);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        NetworkMessage message = decoder.decode(position, null, true, false, false, new Checksum());
        assertNotNull(message);
    }

}