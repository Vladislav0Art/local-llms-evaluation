package org.traccar.protocol;

public class GeneratedTestDecodeNetworkMessage {

    @Test
    public void testDecodeNetworkMessage() {
        ByteBuf buf = Unpooled.buffer(16);
        Network network = new Network();
        // Set up the mock
        Mockito.when(BcdUtil.decodeByte(buf)).thenReturn((byte) 0x02, (byte) 0x03, (byte) 0x04);

        Gt06ProtocolDecoder decoder = new Gt06ProtocolDecoder(new Protocol());
        if (!decoder.decodeNetworkMessage(buf, null)) {
            fail("Failed to decode network message");
        }
    }

}