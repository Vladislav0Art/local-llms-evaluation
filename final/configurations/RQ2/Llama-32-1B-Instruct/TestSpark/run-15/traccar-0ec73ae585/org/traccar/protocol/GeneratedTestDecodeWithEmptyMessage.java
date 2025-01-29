package org.traccar.protocol;

public class GeneratedTestDecodeWithEmptyMessage {

    private static final Pattern pattern = Pattern.compile("^[0-9]+");

    @Test
    public void testDecodeWithEmptyMessage() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

}