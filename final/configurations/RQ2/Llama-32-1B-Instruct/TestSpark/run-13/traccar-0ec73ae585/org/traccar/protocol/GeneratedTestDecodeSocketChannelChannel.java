package org.traccar.protocol;

public class GeneratedTestDecodeSocketChannelChannel {

    @Test
    public void testDecodeSocketChannelChannel() throws Exception {
        Channel channel = Unpooled.buffer().socketChannels();
        String expectedMessage = "watches: 1";
        Object message = decode(channel, SocketAddress.IN, expectedMessage);
        assertEquals(expectedMessage, message.toString());
    }

}