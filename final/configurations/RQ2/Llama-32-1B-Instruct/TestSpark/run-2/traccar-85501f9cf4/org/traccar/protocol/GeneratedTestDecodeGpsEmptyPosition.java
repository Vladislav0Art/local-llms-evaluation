package org.traccar.protocol;

public class GeneratedTestDecodeGpsEmptyPosition {

    @Test
    public void testDecodeGpsEmptyPosition() {
        Position position = new Position();
        byte[] buffer = Unpooled.buffer().writeByte((byte) 0x01);
        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(Protocol.GT06);
        NetworkMessage message = decoder.decode(position, null, true, false, false, null);
        assertNull(message);
    }

}