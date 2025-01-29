package org.traccar.protocol;

public class GeneratedTestDecode_GalileoMessage_3 {

    private Protocol protocol;

    @Test
    public void testDecode_GalileoMessage_3() throws Exception {
        // Arrange
        DeviceSession session = new DeviceSession(new SocketAddress("192.168.1.100:12345"));
        NetworkMessage message = new NetworkMessage(new Position(37.7749, -122.4194), null);

        // Act
        Object result = decode(channel -> channel.readBytes(msg), remoteAddress, msg);

        // Assert
        assertEquals("Hello, world!", (String) result);
    }

}