package org.traccar.protocol;

public class GeneratedTestDecodeChannel {

    @Test
    public void testDecodeChannel() {
        Channel channel = MockChannel.createSocketChannel();
        SocketAddress remoteAddress = MockSocketAddress.create();
        Object msg = "Hello";
        String encodedMessage = encodeString(msg);
        assertEquals(1024, encodedMessage.length(), 0);
        Object decodedMessage;
        try {
            decodedMessage = decoder.decode(channel, remoteAddress, encodedMessage);
        } catch (Exception e) {
            return;
        }
        assertNotNull(decodedMessage);
        assertTrue(decodedMessage instanceof String);
    }

}