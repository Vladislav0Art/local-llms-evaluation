package org.traccar.protocol;

public class GeneratedTestDecodeSessionSocketChannelSocket {

    @Test
    public void testDecodeSessionSocketChannelSocket() throws Exception {
        SessionSocketChannel channel = Unpooled.buffer().sessionSocketChannels();
        String expectedMessage = "watches: 1";
        Object message = decode(channel, SocketAddress.IN, expectedMessage);
        assertEquals(expectedMessage, message.toString());
    }

}