package org.traccar.protocol;

public class GeneratedTestDecodeChannelChannel {

    @Test
    public void testDecodeChannelChannel() throws Exception {
        Channel channel = Unpooled.buffer().channels();
        String expectedMessage = "watches: 1";
        Object message = decode(channel, SocketAddress.OUT, expectedMessage);
        assertEquals(expectedMessage, message.toString());
    }

}