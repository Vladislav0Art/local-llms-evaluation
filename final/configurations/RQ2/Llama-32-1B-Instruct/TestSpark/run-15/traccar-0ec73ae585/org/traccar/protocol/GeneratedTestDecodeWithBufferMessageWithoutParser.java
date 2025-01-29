package org.traccar.protocol;

public class GeneratedTestDecodeWithBufferMessageWithoutParser {

    private static final Pattern pattern = Pattern.compile("^[0-9]+");

    @Test
    public void testDecodeWithBufferMessageWithoutParser() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();
        byte[] message = new byte[0];

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

}