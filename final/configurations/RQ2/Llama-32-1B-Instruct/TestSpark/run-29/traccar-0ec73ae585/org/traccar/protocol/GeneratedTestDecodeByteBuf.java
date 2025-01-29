package org.traccar.protocol;

public class GeneratedTestDecodeByteBuf {

    @Test
    public void testDecodeByteBuf() throws Exception {
        ByteBuf byteBuf = createByteBuf();
        Channel channel = createChannel(0, 0, 1);
        BaseProtocolDecoder decoder = new WatchProtocolDecoder(new Protocol());
        assertNotNull(decoder.decode(channel, null, byteBuf));
    }

}