package org.traccar.protocol;

public class GeneratedTestDecodeSessionChannelSession {

    @Test
    public void testDecodeSessionChannelSession() throws Exception {
        SessionChannel channel = Unpooled.buffer().sessionChannels();
        String expectedMessage = "watches: 1";
        Object message = decode(channel, SocketAddress.OUT, expectedMessage);
        assertEquals(expectedMessage, message.toString());
    }

}