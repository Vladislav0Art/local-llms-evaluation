package org.traccar.protocol;

public class GeneratedTestDecodeHeartbeat {

    @Test
    public void testDecodeHeartbeat() {
        // Arrange
        byte[] heartbeatBytes = "0x00".getBytes();
        MockChannel channel = new MockChannel(new InetSocketAddress("localhost", 12345));
        Object decodedObject = GalileoProtocolDecoder.decode(channel, null, heartbeatBytes);

        // Act
        boolean heartbeat = (boolean) decodedObject;

        // Assert
        assertTrue(heartbeat);
    }

}