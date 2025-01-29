package org.traccar.protocol;

public class GeneratedTestDecodeGpsPosition {

    @Test
    public void testDecodeGpsPosition() {
        ByteBuf buf = Unpooled.buffer(16);
        Position position = new Position();
        // Set up the mock
        Mockito.when(BcdUtil.decodeByte(buf)).thenReturn((byte) 0x05, (byte) 0x01);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        if (!decoder.decodeGpsPosition(buf, null, false, false)) {
            fail("Failed to decode gps position");
        }
    }

}