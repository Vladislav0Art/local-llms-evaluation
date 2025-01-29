package org.traccar.protocol;

public class GeneratedTestDecodeGpsNullPosition {

    @Test
    public void testDecodeGpsNullPosition() {
        Position position = null;
        byte[] buffer = Unpooled.buffer().writeByte((byte) 0x01);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        NetworkMessage message = decoder.decode(position, null, true, false, false, null);
        assertNull(message);
    }

}