package org.traccar.protocol;

public class GeneratedTestDecodeMessage {

    @Test
    public void testDecodeMessage() {
        // Arrange
        String message = "Hello World!";
        MockChannel channel = new MockChannel(new InetSocketAddress("localhost", 12345));
        byte[] messageBytes = message.getBytes();
        Object decodedObject = GalileoProtocolDecoder.decode(channel, null, messageBytes);

        // Act
        String messageReceived = (String) decodedObject;

        // Assert
        assertEquals(message, messageReceived);
    }

}