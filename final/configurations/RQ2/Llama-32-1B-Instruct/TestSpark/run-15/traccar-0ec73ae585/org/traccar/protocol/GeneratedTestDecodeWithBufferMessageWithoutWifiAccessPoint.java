package org.traccar.protocol;

public class GeneratedTestDecodeWithBufferMessageWithoutWifiAccessPoint {

    private static final Pattern pattern = Pattern.compile("^[0-9]+");

    @Test
    public void testDecodeWithBufferMessageWithoutWifiAccessPoint() throws Exception {
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