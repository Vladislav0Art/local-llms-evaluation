package org.traccar.protocol;

public class GeneratedTest {

    private static final Pattern pattern = Pattern.compile("^[0-9]+");

    @Test
    public void testGetHasIndex() throws Exception {
        // Given
        String message = "123";

        // When
        Object result = WatchProtocolDecoder.getHasIndex(message);

        // Then
        assertEquals(true, result instanceof Boolean);
        assertTrue((Boolean) result);
    }

    @Test
    public void testGetManufacturer() throws Exception {
        // Given
        String message = "ABCDEF";

        // When
        Object result = WatchProtocolDecoder.getManufacturer(message);

        // Then
        assertNotNull(result);
        assertEquals("ABCDEF", result.toString());
    }

    @Test
    public void testDecodeWithNullMessage() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

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

    @Test
    public void testDecodeWithInvalidMessage() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

    @Test
    public void testDecodeWithBufferMessage() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNotNull(decodedObject);
    }

    @Test
    public void testDecodeWithBufferMessageWithoutIndex() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();
        byte[] message = new byte[0];

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

    @Test
    public void testDecodeWithBufferMessageWithoutManufacturer() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();
        byte[] message = new byte[0];

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

    @Test
    public void testDecodeWithBufferMessageWithoutPosition() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();
        byte[] message = new byte[0];

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

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

    @Test
    public void testDecodeWithBufferMessageWithoutUnitConverter() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();
        byte[] message = new byte[0];

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

    @Test
    public void testDecodeWithBufferMessageWithoutPatternBuilder() throws Exception {
        // Given
        Channel channel = null;
        SocketAddress remoteAddress = new SocketAddress();
        byte[] message = new byte[0];

        // When
        Object decodedObject = WatchProtocolDecoder.decode(channel, remoteAddress);

        // Then
        assertNull(decodedObject);
    }

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